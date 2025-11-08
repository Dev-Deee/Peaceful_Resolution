import java.util.Scanner;

public class Voting{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your age: ");
    int usersAge = input.nextInt();
    
    int officialVotingAge = 18;
    
    if(usersAge > officialVotingAge){
    System.out.print("You are eligible to vote");    
    }
    else{
    System.out.print("You are not eligible to vote");    
    }

}
}
