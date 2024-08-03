import java.util.*;
class SimpleBankingApp
{  public static double balance=1000;
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
       
        boolean run=true;
        int ch;
        while(run)
        {  System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: checkbalance();
            break;
            case 2: System.out.println("Enter deposit amount:");
            double depositAmount=sc.nextInt();
            deposit(depositAmount);
            break;
            case 3:  System.out.println("Enter withdrawal amount:");
            double withdrawalAmount=sc.nextInt();
           withdraw(withdrawalAmount);
           break;
           case 4:  System.out.println("Thank you for using the Simple Banking App!");
           run=false; break;
           default : System.out.println("Invalid Choice. Please enter a valid option.");
        }}
         
  
        

    }
    public static void checkbalance() {
        System.out.println("Your balance is: $"+balance);
    }
    public static void deposit(double amount) {
        if(amount > 0)
        {
            balance=balance+amount;
        }
        else
        {
            System.out.println("Invalid amount for deposit. Please enter a positive value.");

        }

    }
    public static void withdraw(double amount) {
        if(amount > 0 && amount <=balance)
        {
            balance=balance-amount;
        }
        else
        {
            System.out.println("Invalid amount for withdrawal or insufficient funds.");

        }

    }
 


}



    
