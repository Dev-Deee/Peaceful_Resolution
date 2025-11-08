import java.util.Scanner;
public class NumberRange{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your number: ");
    int userInput = input.nextInt();

    if(userInput <= 100){
    System.out.print("In range");    
    }
    else{
    System.out.print("Out of range");    
    }
}
}
