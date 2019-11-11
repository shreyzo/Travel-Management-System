//package loanSystem.UI;


import java.util.Scanner;  // Import the Scanner class

public class LoginInterface{
    private String uname;
    private String pass;
    
    public void readForm(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter User Name");
        this.uname= myObj.nextLine();  // Read user input
        System.out.println("Enter Password");
        this.pass=myObj.nextLine();  // Read user input
       
    }
    public String getUname(){
        return this.uname;
    }
    public String getPass(){
        return this.pass;
    }

    public static void main(String[] args){
        LoginInterface li = new LoginInterface();
        li.readForm();
        System.out.println("User Name: "+ li.getUname());
        System.out.println("Password: "+ li.getPass());
    }
}