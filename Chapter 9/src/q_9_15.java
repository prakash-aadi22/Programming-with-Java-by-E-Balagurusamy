import java.util.Scanner;

class read {
    public void count() {
        Scanner sc = new Scanner(System.in);
        String story = """
                Once, there was a boy who became bored when he watched over the village sheep grazing on the hillside. To entertain himself, he sang out, “Wolf! Wolf! The wolf is chasing the sheep!”
                When the villagers heard the cry, they came running up the hill to drive the wolf away. But, when they arrived, they saw no wolf. The boy was amused when seeing their angry faces.
                “Don’t scream wolf, boy,” warned the villagers, “when there is no wolf!” They angrily went back down the hill.
                Later, the shepherd boy cried out once again, “Wolf! Wolf! The wolf is chasing the sheep!” To his amusement, he looked on as the villagers came running up the hill to scare the wolf away.
                As they saw there was no wolf, they said strictly, “Save your frightened cry for when there really is a wolf! Don’t cry ‘wolf’ when there is no wolf!” But the boy grinned at their words while they walked grumbling down the hill once more.
                Later, the boy saw a real wolf sneaking around his flock. Alarmed, he jumped on his feet and cried out as loud as he could, “Wolf! Wolf!” But the villagers thought he was fooling them again, and so they didn’t come to help.
                At sunset, the villagers went looking for the boy who hadn’t returned with their sheep. When they went up the hill, they found him weeping.
                “There really was a wolf here! The flock is gone! I cried out, ‘Wolf!’ but you didn’t come,” he wailed.
                An old man went to comfort the boy. As he put his arm around him, he said, “Nobody believes a liar, even when he is telling the truth!”""";
        System.out.println(story);
        System.out.println("*************************************************************************************************************************************************************************");
        System.out.print("Enter the word that you want to count its occurrences: ");
        String word = sc.next();
        System.out.println(story.contains(word));
        String[] a = story.split(" ");
        int countNo = 0;
        for (String s : a) {
            if (word.equals(s))
                countNo++;
        }
        System.out.println("Total number of " + word + " are: " + countNo);
    }
}

public class q_9_15 {
    public static void main(String[] args) {
        try {
            read r = new read();
            r.count();
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
