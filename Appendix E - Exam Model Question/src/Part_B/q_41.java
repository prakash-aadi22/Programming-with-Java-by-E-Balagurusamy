package Part_B;

//class VehicleA {
//    abstract void displayA();
//}

//abstract VehicleB {
//    abstract void displayB();
//}

abstract class VehicleC {
    abstract void displayC();
}

//class abstract VehicleD {
//    abstract void displayD();
//}

abstract class VehicleE {
    static {
        System.out.println("Car");
    }

    abstract void displayE();
}

public class q_41 {
    public static void main(String[] args) {
        VehicleC vc = new VehicleC() {
            @Override
            void displayC() {
                System.out.println("VehicleC");
            }
        };
        vc.displayC();

        VehicleE ve = new VehicleE() {
            @Override
            void displayE() {
                System.out.println("VehicleE");
            }
        };
        ve.displayE();
    }
}
