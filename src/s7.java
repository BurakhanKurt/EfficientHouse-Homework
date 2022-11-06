public class s7 {
    public static void main(String[] args) {
        timeFormatter (50391);
    }

    public static void timeFormatter ( int second){
        int hour = second / 3600 ;
        second = second % 3600 ;
        int minute = second / 60;
        second = second % 60 ;

        System.out.printf("saat: %d, dakika: %d, saniye: %d", hour, minute,second);
    }
}
