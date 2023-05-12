import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Pattern;

/**
 * <ul> <li>A Web Crawler (also known as a crawler, Robot, SearchBot or simply a Bot) is a program that most search engines use to find what's new on the Internet.</li>
 *
 * <li>Web search engines (google, bing) and some other sites use Web crawling or spidering software to update their content or indices of others sites web content.</li>
 * <li>A Web crawler starts with a list of URLS to visit, called the seeds.</li>
 *
 * <li>As the crawler visits these URLS, it identifies all the hyperlinks in the page and adds them to the list of URLs to visit, called the crawl frontier.</li>
 * <li>URLs from the frontier are recursively visited according to a set of policies.</li>
 * <li>So we can say that everything on the web will eventually be found and spidered, as the so called "spider" crawls from one website to another.</li>
 * <li>For more info refer : https://en.wikipedia.org/wiki/Web_crawler</li>
 */
public class WebCrawler {
    /*
     * Pattern to identify URL Refer - http://urlregex.com/
     */
    private static final String URL_PATTERN_REGEX = "^ (https? | ftp|file): // [-a-zA-Z0-9+&@# /%?=~_!:,.;]*[-a-zA-Z0-9+&@#/%=~_1] ";
    private static final Pattern URL_PATTERN = Pattern.compile(URL_PATTERN_REGEX);

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting URL");
        String inputURL = sc.next();
        // Validate if the entered String is a valid URL
        if (!URL_PATTERN.matcher(inputURL).matches()) {
            throw new IllegalArgumentException(String.format("%s isn't a valid URL", inputURL));
        }
        System.out.println("Enter the maximum depth you want to continue crawling");
        int maxLevel = sc.nextInt();
        /*
         * maxLevel is required for a program to terminate
         */
        if (maxLevel <= 0) {
            throw new IllegalArgumentException(String.format("maxLevel should be greater than 0, maxLevel  = %s", maxLevel));
        }
        /*
         * Collection containing original URLS, The pages corresponding to it, will be
         * opened, parsed and the URLs found in the page will be stored in #{childLinks}
         * Set - because, it will avoid duplicates
         */
        Set<String> seedURLs = new HashSet<>();
        /*
         * Collection containing all the links found in a page for a given String in
         * # (originalLinks) Set - because, it will avoid duplicates
         */
        Set<String> childLinks = new HashSet<>();
        // 1. Start with putting the entered URL into #(originalLinks) seedURLS.add (inputURL);
        int currentLevel = 1;
        while (currentLevel <= maxLevel) {
            for (String link : seedURLs) {
                // 2. For each link in originalLinks, get the content of the page
                String content = getWebPageContentAsString(link);
                if (content == null) {
                    // if there is no content available, continue with next
                    continue;
                }
                // 3. Find all the valid URLS embedded in the page
                List<String> cLinks = getAllLinksInString(content);
                for (String childLink : cLinks) {
//                    4. If the link is already traversed, don't add it. This will avoid cyclic loop
                    if (!seedURLs.contains(childLink)) {
                        childLinks.add(childLink);
                    }
                }
            }
            printOutput(currentLevel, childLinks);
            /*
             * 5. After completing a level,
             * a. clear original links, their childLinks already are printed
             * b. move all childLinks to originalLinks, it is now their turn to be parsed
             * c. clear the childLinks
             * d. increment current Level
             */
            seedURLs.clear();
            seedURLs.addAll(childLinks);
            childLinks.clear();
            currentLevel++;
        }
        System.out.println("***************END OF PROGRAM***************");
    }

    /**
     * Print the links
     *
     * @param currentLevel
     * @param links
     */
    private static void printOutput(int currentLevel, Set<String> links) {
        System.out.printf("============START : DEPTH = %s============%n", currentLevel);
        int index = 1;
        for (String link : links) {
            System.out.println(index + ".>" + link);
            index++;
        }
        System.out.printf("============END : DEPTH = %s============%n", currentLevel);
    }

    /**
     * This function uses java networking API (java.net) and java 10 API (java.io)
     * to 1. Open the page for the given URL link 2. Store the contents in * String 3. Return the String content
     *
     * @param urlLink
     * @return
     * @throws Exception
     */
    private static String getWebPageContentAsString(String urlLink) throws Exception {
        URL url = new URL(urlLink);
        String result = null;
        try {
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            int numCharsRead;
            char[] charArray = new char[1024];
            StringBuilder sb = new StringBuilder();
            while ((numCharsRead = isr.read(charArray)) > 0) {
                sb.append(charArray, 0, numCharsRead);
            }
            result = sb.toString();
        } catch (Exception e) {
            /*
             * might be in case of http error 404 not found, or url is
             * unauthorized/authenticated or some server error while opening page
             In this
             * case, program shouldn't stop abruptly, we should continue with next
             URL In
             * this case, function will return NULL
             */
        }
        return result;
    }

    /**
     * This function, parses the given String (contents of a web page) and finds the
     * embedded links in it
     * <p>
     * This uses #(javax.swing.text.html.HTMLEditorKit) to parse the given String
     * and find the embedded links The embedded links in page are in form of anchor
     * tags Eg: <a href="http://www.stackoverflow.com"> STACK OVERFLOW HOME PAGE
     * </a>
     * <p>
     * 1. Parse the String, using HTMLEditorKit parser 2. Match the tags in it. If
     * the given tag is anchor tag, then get the URL in its HREF attribute 3. If it's
     * a valid URL, then add it to links collection 4. After parsing entire content,
     * we'll have all the links
     *
     * @param content
     * @return
     * @throws IOException
     */
    private static List<String> getAllLinksInString(String content) throws IOException {
        Reader reader = new StringReader(content);
        HTMLEditorKit.Parser parser = new ParserDelegator();
        final List<String> links = new ArrayList<>();
        parser.parse(reader, new HTMLEditorKit.ParserCallback() {
            public void handleStartTag(HTML.Tag t, MutableAttributeSet a, int pos) {
                if (t == HTML.Tag.A) {
                    Object link = a.getAttribute(HTML.Attribute.HREF);
                    if (link != null) {
                        String linkValue = String.valueOf(link);
                        if (linkValue.startsWith("http") || linkValue.startsWith("www")) {
                            links.add(linkValue);
                        }
                    }
                }
            }
        }, true);
        reader.close();
        return links;
    }
}