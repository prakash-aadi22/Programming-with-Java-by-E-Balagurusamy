class studentMarks {
    public void display() {
        int[] student = new int[61];
        int[] subject = new int[9];
        for (int i = 1; i < student.length; i++) {
            for (int j = 1; j < subject.length; j++) {
                int max = 100;
                int min = 0;
                int marks = (min + (int) (Math.random() * ((max - min) + 1)));
                student[i] = i;
                subject[j] = j;
                System.out.println("Student_Part_C_q_16 Code: " + student[i] + ", Subject Code: " + subject[j] + ", Marks: " + marks);
            }
            System.out.println("-----------------------------------------------------------");
        }
    }
}

public class q_9_3 {
    public static void main(String[] args) {
        studentMarks sm = new studentMarks();
        sm.display();
    }
}
