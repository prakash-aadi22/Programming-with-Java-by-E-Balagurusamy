import java.util.Scanner;

interface sports {
    float sportWt = 6.0f;

//    void setWt();
}

class student {
    int rollNo;

    void getNo(int n) {
        rollNo = n;
    }

    void setNo() {
        System.out.println("Roll Number: " + rollNo);
    }
}

class test extends student {
    float part1, part2;

    void getMarks(float m1, float m2) {
        part1 = m1;
        part2 = m2;
    }

    void setMarks() {
        System.out.println("Marks obtained --> ");
        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
    }
}

class result extends test implements sports {
    float total;

//    @Override
    public void setWt() {
        System.out.println("Sport Wt: " + sportWt);
    }

    void display() {
        total = part1 + part2 + sportWt;
        setNo();
        setMarks();
        setWt();
        System.out.println("Total Score: " + total);
    }
}

public class eg_10_2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            result st1 = new result();
            System.out.print("Enter the roll number: ");
            int a = sc.nextInt();
            System.out.print("Enter the marks of part 1: ");
            float f1 = sc.nextFloat();
            System.out.print("Enter the marks of part 2: ");
            float f2 = sc.nextFloat();
            st1.getNo(a);
            st1.getMarks(f1, f2);
            st1.display();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
