import java.util.Scanner;

class staff {
    public void display(int code, String name) {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class teacher extends staff {
    public void display(String subject, String publication) {
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class officer extends staff {
    public void display(char grade) {
        System.out.println("Grade: " + grade);
    }
}

class typist extends staff {
    public void display(int speed) {
        System.out.println("Speed: " + speed + " Words per minute");
    }
}

class casual extends typist {
    public void display(int dailyWages) {
        System.out.println("Daily Wages: ₹" + dailyWages);
    }
}

class regular extends typist {
    public void display() {
        System.out.println("\0");
    }
}

public class q_8_20 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            staff s = new staff();
            teacher t = new teacher();
            officer o = new officer();
            typist ty = new typist();
            casual c = new casual();
            regular r = new regular();
            System.out.print("Enter your code: ");
            int code = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            s.display(code, name);
            System.out.println("Select your category");
            System.out.print("Enter 'T' for 'TEACHER' or 'TY' for 'TYPIST' or 'O' for 'OFFICER': ");
            String category = sc.nextLine();
            System.out.println("Option entered: " + category.toUpperCase());
            if (category.equalsIgnoreCase("T")) {
                System.out.print("Enter your subject: ");
                String subject = sc.nextLine();
                System.out.print("Enter your publication: ");
                String publication = sc.nextLine();
                t.display(subject, publication);
            } else if (category.equalsIgnoreCase("O")) {
                System.out.print("Enter your grade: ");
                char grade = sc.next().charAt(0);
                o.display(grade);
            } else if (category.equalsIgnoreCase("TY")) {
                System.out.print("Enter your speed: ");
                int speed = sc.nextInt();
                sc.nextLine();
                ty.display(speed);
                System.out.println("Select your under category");
                System.out.print("Enter 'C' for 'CASUAL' or 'R' for 'REGULAR': ");
                String underCategory = sc.nextLine();
                System.out.println("Option entered: " + underCategory.toUpperCase());
                if (underCategory.equalsIgnoreCase("C")) {
                    System.out.print("Enter your daily wages: ₹");
                    int dailyWages = sc.nextInt();
                    c.display(dailyWages);
                } else if (underCategory.equalsIgnoreCase("R")) {
                    r.display();
                } else {
                    System.out.println("Error");
                }
            } else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
