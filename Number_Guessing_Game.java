import java.util.*;
public class NumberGuessingGame {
static Scanner sc= new Scanner(System.in);
static void GuessingGame(int n)
{int num=1+(int)(100*Math.random());
    int K=n;
    int i,guess;
    for(i=0;i<K;i++)
    {
        System.out.println("Guess the number");
        guess =sc.nextInt();
        if(guess==num)
        {System.out.println("Congratulations! You guessed the number");
        break;}
        else { if(num > guess && i!=K-1) {
            System.out.println("The number is greater than "+ guess +".");
        }
        else { if(num < guess && i!=K-1) {
            System.out.println("The number is lesser than "+ guess +".");
        }
    } 

}}
if(i==K)
{  System.out.println("You have exhausted all the trials.");
  
    System.out.println("The number was " + num);
}

} public static void main(String args[])
{
  
    boolean Value=true;
    while(Value)
    {   System.out.println("Welcome to The Number Guessing Game!!");
        System.out.println("A number is chosen between 1-100. Guess the number.");
    System.out.println("Choose the difficulty level.");
    System.out.println("1. Easy: You get 7 trials to guess the number.");
    System.out.println("2. Medium: You get 5 trials to guess the number.");
    System.out.println("3. Hard: You get 3 trials to guess the number.");
    System.out.println("4. Exit");
    int ch=sc.nextInt();
        switch(ch)
        {
            case 1: GuessingGame(7);
            break;
            case 2: GuessingGame(5);
            break;
            case 3: GuessingGame(3);
            break;
            case 4: Value=false;
            break;
            default : System.out.println("Invalid Choice. Please Choose a valid option.");
        }
    }
    
}
}
    

