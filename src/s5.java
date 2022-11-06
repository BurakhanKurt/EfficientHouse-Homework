public class s5 {
    public static void main(String[] args) {
        replaceFirstHate ( "I hate you. (hate)" );
        replaceAllHate( "I hate you. (hate)" );
        replace("I hate you. (hate)");
    }

    public  static void replaceFirstHate ( String str ){
        String newStr = str.replaceFirst("hate","love");
        System.out.println(newStr);
    }
    public  static void replaceAllHate ( String str ){
        String newStr = str.replaceAll("hate","love");
        //String newStr = str.replaceAll('a','b'); replace karakter değiştirirken replaceAll karakter değiştiremez
        System.out.println(newStr);
    }

    public  static void replace ( String str ){
        String newStr = str.replace("hate","love");
        //String newStr = str.replace('a','b'); replace karakter değiştirirken replaceAll karakter değiştiremez
        System.out.println(newStr);
    }
}
