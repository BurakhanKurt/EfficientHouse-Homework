public class s8 {
    public static final double DISTANCE = 180f;
    public static void main(String[] args) {
        double time;
        System.out.println("This program calculates vehicle average speed given a time and distance traveled.");
        time = 20.5;
        double averangeSpeed = DISTANCE / time;
        System.out.println("Car average speed is " + averangeSpeed
                + " miles per hour.");
    }
}
