public class eg_9_8 {
    enum days {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

    public static void main(String[] args) {
        for (days d : days.values()) {
            weekend(d);
        }
    }

    private static void weekend(days d) {
        if (d.equals(days.Sunday) || d.equals(days.Saturday)) {
            System.out.println("Value = " + d + " is a Holiday.");
        } else {
            System.out.println("Value = " + d + " is a Working Day.");
        }
    }
}
