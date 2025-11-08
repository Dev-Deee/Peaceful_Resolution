import java.util.Scanner;
public class Password{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your username: ");
    String userName = input.nextLine();
    System.out.print("Enter your Password: ");
    int userPassword = input.nextInt();
    
    String loginUsername = "Oladayo";
    int loginPassword = 123456;

    if(userPassword == loginPassword || userName == loginUsername){
    System.out.print("Login Sucessful");    
    }
    else{
    System.out.print("Login failed");    
    }
}
}
