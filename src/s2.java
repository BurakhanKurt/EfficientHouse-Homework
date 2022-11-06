public class s2 {
    public static void main(String[] args) {
        videoGameCoupons (1);
    }
    public static void videoGameCoupons (int coupons){
        int candy,gumball;
        candy = coupons / 10 ;
        coupons = coupons % 10 ;
        gumball = coupons / 3 ;
        coupons = coupons % 3;
        System.out.printf("Candy: %d\nGumball: %d\nAvailable Coupons: %d",candy,gumball,coupons);
    }
}
