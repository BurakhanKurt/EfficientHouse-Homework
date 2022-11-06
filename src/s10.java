public class s10 {
    public static void main(String[] args) {
        caffeine ();
    }
    public static void caffeine (){
        double colaCaffeine_g = (34f/1000f) , coffieCaffaine_g = (160f/1000f),colaLimit,coffieLimit;
        colaLimit = Math.ceil ( 10/colaCaffeine_g );
        coffieLimit = Math.ceil ( 10/coffieCaffaine_g );
        System.out.printf("cola is death : %.0f coffie is death : %.0f", colaLimit,coffieLimit);
    }
}
