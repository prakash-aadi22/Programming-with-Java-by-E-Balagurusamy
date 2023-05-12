package Students;

class student1 {
    int rollNo1;

    public void getNo1(int n1) {
        rollNo1 = n1;
    }

    public void setNo1() {
        System.out.println("Roll Number: " + rollNo1);
    }
}

public class q_11_5_student extends student1 {
    public float part11, part21;

    public void getMarks1(float m11, float m21) {
        part11 = m11;
        part21 = m21;
    }

    public void setMarks1() {
        System.out.println("Marks obtained --> ");
        System.out.println("Part 1: " + part11);
        System.out.println("Part 2: " + part21);
    }
    public static void main(String[] args) {
        System.out.println("Go to q_11_5_sport");
    }
}
