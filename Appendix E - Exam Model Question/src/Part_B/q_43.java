package Part_B;
interface Area{
    float compute(float x, float y);
}
class Room implements Area{
    @Override
    public float compute(float x, float y){
        return (x * y);
    }
}
public class q_43 {
    public static void main(String[] args) {
        Room rm = new Room();
        System.out.println(rm.compute(5.2f,2.5f));
    }
}
