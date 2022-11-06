public class s3 {
    public static void main(String[] args) {
        changeName ("walt","savitch");
    }
    public static void changeName (String firstName,String lastName){
        String newFirstName = firstName.substring(1,2).toUpperCase() +
                firstName.substring(2) +
                firstName.charAt(0) +
                "ay";

        String newLastName = lastName.substring(1,2).toUpperCase() +
                lastName.substring(2) +
                lastName.charAt(0)+
                "ay";

        String newFullName = newFirstName + " " + newLastName;

        System.out.println(newFullName);
    }
}
