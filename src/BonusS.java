import java.util.Scanner;

public class BonusS {
    public static void main(String[] args) {
        //addToString ();
        System.out.println(capitilaze("bugun hAVA cOk Guzel"));
        System.out.println("*" + trimLeading("     aaaaaaa "));
        System.out.println(trimTrailing("     aaaaaaa       ")+"*");

    }

    public static String capitilaze (String str){
        str = str.substring(0,1).toUpperCase() + (str.substring(1).toLowerCase()) ;
        return str;
    }


    public static void addToString (){
        Scanner input = new Scanner(System.in);
        String result="",temp;

        while(true){
           temp=input.nextLine();
           result+= temp + "-" ;
            if(temp.equals("elma")) {
                result=result.substring(0,(result.length()-1));
                break;
            }
        }
        System.out.println(result);
    }

    public static String trimLeading(String str){

        while(str.charAt(0) == ' ' ){
            str=str.substring(1);
        }

        return str;
    }

    public static String trimTrailing(String str){
        while(str.charAt(str.length()-1) == ' ' ){
            str=str.substring(0,str.length()-1);
        }
        return str;
    }

    public static void pangram(String str) {
        int i = 0;
        while(i<str.length()){
            str.charAt(i);
            i++;
        }
    }
}
