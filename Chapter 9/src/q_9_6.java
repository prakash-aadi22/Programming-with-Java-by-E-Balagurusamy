class temperatures {
    public void display() {
//        int[][] dayCity = new int[31][10];
        int[][] dayCity = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, {20, 21, 22, 23, 24, 25, 26, 27, 28, 29}, {30, 31, 32, 33, 34, 35, 36, 37, 38, 39}, {40, 41, 42, 43, 44, 45, 46, 47, 48, 49}, {50, 51, 52, 53, 54, 55, 56, 57, 58, 59}, {60, 61, 62, 63, 64, 65, 66, 67, 68, 69}, {70, 71, 72, 73, 74, 75, 76, 77, 78, 79}, {80, 81, 82, 83, 84, 85, 86, 87, 88, 89}, {90, 91, 92, 93, 94, 95, 96, 97, 98, 99}, {100, 101, 102, 103, 104, 105, 106, 107, 108, 109}, {110, 111, 112, 113, 114, 115, 116, 117, 118, 119}, {120, 121, 122, 123, 124, 125, 126, 127, 128, 129}, {130, 131, 132, 133, 134, 135, 136, 137, 138, 139}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}};
        int i, j, max, min, m, n;
        m = n = 1;
//        for (i = 0; i < 31; i++) {
//            for (j = 0; j < 10; j++) {
        for (int[] a : dayCity){
            for (int b : a){
//                System.out.print(dayCity[i][j] + " ");
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println("\b\b");
        max = dayCity[0][0];
        for (i = 0; i < 31; i++) {
            for (j = 0; j < 10; j++) {
                if (max < dayCity[i][j]) {
                    max = dayCity[i][j];
                    m = j + 1;
                    n = i + 1;
                }
            }
        }
        System.out.println("Highest temperature is " + max + " in the city number " + m + " on the day " + n + "th.");
        min = dayCity[0][0];
        m = n = 1;
        for (i = 0; i < 31; i++) {
            for (j = 0; j < 10; j++) {
                if (min > dayCity[i][j]) {
                    min = dayCity[i][j];
                    m = j + 1;
                    n = i + 1;
                }
            }
        }
        System.out.println("Lowest temperature is " + min + " in the city number " + m + " on the day " + n + "th.");
    }
}

public class q_9_6 {
    public static void main(String[] args) {
        temperatures tmp = new temperatures();
        tmp.display();
    }
}
