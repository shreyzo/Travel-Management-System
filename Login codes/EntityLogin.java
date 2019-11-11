import java.util.Scanner;  // Import the Scanner class

public class EntityLogin{
    public String getUserDetails(String uName){
        if (uName.equals("Mahesh"))
            return "Mahesh123";
        else
            return "pass";
    }
    public static void main(String[] args){
        EntityLogin el = new EntityLogin();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter User Name");
        String uname= myObj.nextLine();  // Read user input

        System.out.println("User Password: "+ el.getUserDetails(uname));
    }
}