import java.util.Scanner;
public class Temperature{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your Temperature: ");
    int userTemperature = input.nextInt();

    if(userTemperature <= 15){
    System.out.print("It is Cold");
    }
    else if(userTemperature <= 30){
    System.out.print("It is Warm");
    }
    else if(userTemperature > 30){
    System.out.print("It is Hot");
    }
}
}
