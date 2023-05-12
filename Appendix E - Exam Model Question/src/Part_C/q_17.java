package Part_C;
abstract class student{
    abstract double result();
}
public class q_17 {
    public static void main(String[] args) {
        student st = new student() {
            @Override
            double result() {
                return 0;
            }
        };
        st.result();
    }
}
