package Part_B;

abstract class Print {
    abstract void show();
}

abstract class Display extends Print {
}

public class q_24 {
    public static void main(String[] args) {
        Print pd = new Display() {
            @Override
            void show() {
                System.out.println("show pd");
            }
        };
        pd.show();
    }
}
