package Part_B;

//class Student extends String {
class Student {
    public void s() {
        System.out.println("Will not compile because String is final");
    }
}

public class q_23 {
    public static void main(String[] args) {
        Student s = new Student();
        s.s();
    }
}
