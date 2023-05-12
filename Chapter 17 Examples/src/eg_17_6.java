import java.util.Stack;

public class eg_17_6 {
    public static void main(String[] args) {
//        Stack st = new Stack();
        Stack<String> st = new Stack<>();
        st.push("Java");
        st.push("latest");
        st.push("edition");
        st.push("-seventh");
        System.out.println("The element in the Stack: " + st);
        System.out.println("The element at the top: " + st.peek());
        System.out.println("The element popped out of the stack: " + st.pop());
        System.out.println("The element in a stack after pop out zn element: " + st);
        System.out.println("The result of the searching: " + st.search("r u"));
    }
}
