public class s6 {
    public static void main(String[] args) {
        rate();
    }

    public static void rate (){
        int principalAmount = 1000 ,numberOfYears = 5;
        double intRate = 5.0,simpleInterest ;

        simpleInterest = ( (double) principalAmount * intRate * numberOfYears ) / 100;

        System.out.printf("Simple interest : %.1f" ,simpleInterest);
    }
}
