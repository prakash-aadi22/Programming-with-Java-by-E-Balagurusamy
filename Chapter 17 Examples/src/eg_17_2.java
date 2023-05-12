import java.util.LinkedList;

class car {
    String car1, car2, car3, car4;

    car() {
        car1 = "Mercedes";
        car2 = "Ferrari";
        car3 = "BMW";
        car4 = "Tesla";
    }
}

class bird {
    String bird1, bird2, bird3;

    bird() {
        bird1 = "Parrot";
        bird2 = "Duck";
        bird3 = "Raven";
    }
}

public class eg_17_2 {
//    private LinkedList list = new LinkedList<();
    private final LinkedList<Object> list = new LinkedList<>();

    public static void main(String[] args) {
        car myCar;
        bird myBird;
        eg_17_2 s = new eg_17_2();
        s.push1(new car());
        s.push2(new bird());
        myCar = (car) s.pop();
        System.out.println("The first element of the list: " + myCar);
        myBird = (bird) s.bottom();
        System.out.println("The first element of the list: " + myBird);
    }

    public void push1(Object o) {
        list.addFirst(o);
    }

    public void push2(Object obj) {
        list.addLast(obj);
    }

    public Object bottom() {
        return list.getLast();
    }

    public Object pop() {
        return list.removeFirst();
    }
}
