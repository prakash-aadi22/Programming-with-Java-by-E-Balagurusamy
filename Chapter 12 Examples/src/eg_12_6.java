class pyramid {
    synchronized void draw_pyramid(char ch) {
/*
        for (int i = 0; i < 10; i += 2) {
            for (int k = 10 - i; k > 0; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
*/
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class x extends Thread {
    pyramid p;

    x(pyramid p) {
        this.p = p;
    }

    public void run() {
        p.draw_pyramid('*');
    }
}

class y extends Thread {
    pyramid p;

    y(pyramid p) {
        this.p = p;
    }

    public void run() {
        p.draw_pyramid('#');
    }
}

public class eg_12_6 {
    public static void main(String[] args) {
        pyramid poBj = new pyramid();
        x thX = new x(poBj);
        y thY = new y(poBj);
        thX.start();
        thY.start();
    }
}
