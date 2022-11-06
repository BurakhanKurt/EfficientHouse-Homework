public class s9 {
    public static void main(String[] args) {
        idealBodyWeight(6,3);
    }
    public static void idealBodyWeight (int feet,int inc){
        feet -=5;
        inc += feet * 12;
        int pound = 110 + ( inc * 5 ) ;
        System.out.println("ideal Body Weight: " + pound);
    }
}
