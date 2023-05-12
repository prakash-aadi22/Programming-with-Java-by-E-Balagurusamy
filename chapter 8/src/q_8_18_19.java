import java.util.Scanner;

class currAct {
    long balance = 100000000, deposit, withdraw, minimumBalance = 5000;
    String type = "Current Account";

    public void display(String name, long accNum) {
        System.out.println("Name of depositor: " + name);
        System.out.println("Account number: " + accNum);
        System.out.println("Type of account: " + type);
        System.out.println("Balance amount in the account: ₹" + balance);
        System.out.println("Minimum Balance: ₹" + minimumBalance);
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

    public void currentDeposit() {
        balance = balance + deposit;
        System.out.println("New balance amount in the account: ₹" + balance);
    }

    public void currentWithdraw() {
        balance = balance - withdraw;
        if (balance > 0) {
            System.out.println("New balance amount in the account: ₹" + balance);
        } else {
            System.out.println("Error");
        }
    }

    public void penalty() {
        balance = balance - withdraw;
        if (balance < minimumBalance) {
            System.out.println("Service charge will be imposed as your new balance: " + balance + " is less than minimum balance: " + minimumBalance);
            long newBalance = (long) (balance * 0.02);
            System.out.println("So, your balance will deducted 2% (two percent) every month.");
            System.out.println("And, your new balance will become after one month: " + newBalance);
        }
    }
}

class savAcct {
    long balance = 1000000, deposit, withdraw, minimumBalance = 3000;
    String type = "Saving Account";

    public void display(String name, long accNum) {
        System.out.println("Name of depositor: " + name);
        System.out.println("Type of account: " + type);
        System.out.println("Account number: " + accNum);
        System.out.println("Balance amount in the account: ₹" + balance);
        System.out.println("Minimum Balance: ₹" + minimumBalance);
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

    public void savingDeposit() {
        balance = balance + deposit;
        System.out.println("New balance amount in the account: ₹" + balance);
    }

    public void savingWithdraw() {
        balance = balance - withdraw;
        if (balance > 0) {
            System.out.println("New balance amount in the account: ₹" + balance);
        } else {
            System.out.println("Error");
        }
    }

    public void penalty() {
        balance = balance - withdraw;
        if (balance < minimumBalance) {
            System.out.println("Service charge will be imposed as your new balance: " + balance + " is less than minimum balance: " + minimumBalance);
            long newBalance = (long) (balance * 0.01);
            System.out.println("So, your balance will deducted 1% (one percent) every month.");
            System.out.println("And, your new balance will become after one month: " + newBalance);
        }
    }
}

public class q_8_18_19 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            currAct c = new currAct();
            savAcct s = new savAcct();
            System.out.print("Enter your Name: ");
            String name = sc.nextLine();
            System.out.print("Enter your Account Number: ");
            long accNum = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter your account type\nFor 'Current Account' enter 'C' or 'Saving account' enter 'S': ");
            String type = sc.nextLine();
            if (type.equalsIgnoreCase("C")) {
                c.display(name, accNum);
                System.out.print("Enter 'W' for withdrawing money or 'D' for depositing or 'E' for exiting: ");
                String wd = sc.nextLine();
                System.out.println("Option entered: " + wd.toUpperCase());
                if (wd.equalsIgnoreCase("D")) {
                    System.out.print("Enter the amount to deposit: ₹");
                    long deposit = sc.nextLong();
                    c.setDeposit(deposit);
                    c.getDeposit();
                    c.currentDeposit();
                    c.penalty();
                } else if (wd.equalsIgnoreCase("W")) {
                    System.out.print("Enter the amount to withdraw: ₹");
                    long withdraw = sc.nextLong();
                    c.setWithdraw(withdraw);
                    c.getWithdraw();
                    c.currentWithdraw();
                    c.penalty();
                } else if (wd.equalsIgnoreCase("E")) {
                    System.out.println("Thank You for coming");
                    System.exit(0);
                } else {
                    System.out.println("Error");
                }
            } else if (type.equalsIgnoreCase("S")) {
                s.display(name, accNum);
                System.out.print("Enter 'W' for withdrawing money or 'D' for depositing or 'E' for exiting: ");
                String wd = sc.nextLine();
                System.out.println("Option entered: " + wd.toUpperCase());
                if (wd.equalsIgnoreCase("D")) {
                    System.out.print("Enter the amount to deposit: ₹");
                    long deposit = sc.nextLong();
                    s.setDeposit(deposit);
                    s.getDeposit();
                    s.savingDeposit();
                    s.penalty();
                } else if (wd.equalsIgnoreCase("W")) {
                    System.out.print("Enter the amount to withdraw: ₹");
                    long withdraw = sc.nextLong();
                    s.setWithdraw(withdraw);
                    s.getWithdraw();
                    s.savingWithdraw();
                    s.penalty();
                } else if (wd.equalsIgnoreCase("E")) {
                    System.out.println("Thank You for coming");
                    System.exit(0);
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
