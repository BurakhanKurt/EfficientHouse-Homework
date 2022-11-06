public class s1 {
    public static void main(String[] args) {
        bodyMassIndex(100,1.85);
    }
    public static void bodyMassIndex (double kg,double m){
        double result;
        result = kg / Math.pow(m,2);
        System.out.printf("BMI = %.1f",result);
    }
}
