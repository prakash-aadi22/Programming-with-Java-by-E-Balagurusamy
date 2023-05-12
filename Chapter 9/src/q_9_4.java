class printing {
    public void display() {
        int m;
        int[] x = new int[10];
        int[] y = new int[11];
        for (m = 1; m < 10; ++m)
            x[m] = y[m] = m;
        for (m = 0; m < 10; m++)
            System.out.print(x[m] + ", ");
    }
}

public class q_9_4 {
    public static void main(String[] args) {
        printing q94 = new printing();
        q94.display();
    }
}
