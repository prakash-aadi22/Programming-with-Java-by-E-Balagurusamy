import java.util.Scanner;

class bank {
    String type = "Current Account";
    long balance = 100000000, deposit, withdraw;

    public void display(String name, long accNum) {
        System.out.println("Name of depositor: " + name);
        System.out.println("Type of account: " + type);
        System.out.println("Account number: " + accNum);
        System.out.println("Balance amount in the account: ₹" + balance);
    }

    public void getDeposit() {
        System.out.println("Amount deposited: ₹" + deposit);
    }

    public void setDeposit(long deposit1) {
        this.deposit = deposit1;
    }

    public void getWithdraw() {
        System.out.println("Amount withdrew: ₹" + withdraw);
    }

    public void setWithdraw(long withdraw1) {
        this.withdraw = withdraw1;
    }

    public void display1() {
        balance = balance + deposit;
        System.out.println("New balance amount in the account: ₹" + balance);
    }

    public void display2() {
        balance = balance - withdraw;
        if (balance >= 0) {
            System.out.println("New balance amount in the account: ₹" + balance);
        } else {
            System.out.println("Error");
        }
    }
}

public class q_8_16_17 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            bank b = new bank();
            System.out.print("Enter your Name: ");
            String nameSc = sc.nextLine();
            System.out.print("Enter your Account Number: ");
            long accNumSc = sc.nextLong();
            b.display(nameSc, accNumSc);
            sc.nextLine();
            System.out.print("Enter 'W' for withdrawing money or 'D' for depositing or 'E' for exiting: ");
            String wd = sc.nextLine();
            System.out.println("Option entered: " + wd.toUpperCase());
            if (wd.equalsIgnoreCase("D")) {
                System.out.print("Enter the amount to deposit: ₹");
                long depositSc = sc.nextLong();
                b.setDeposit(depositSc);
                b.getDeposit();
                b.display1();
            } else if (wd.equalsIgnoreCase("W")) {
                System.out.print("Enter the amount to withdraw: ₹");
                long withdrawSc = sc.nextLong();
                b.setWithdraw(withdrawSc);
                b.getWithdraw();
                b.display2();
            } else if (wd.equalsIgnoreCase("E")) {
                System.out.println("Thank You for coming");
                System.exit(0);
            } else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            System.out.println("Input Error\n" + e);
        }
    }
}
