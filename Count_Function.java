//calculates the number of positive, nagative and zero integers in a group of numbers
import java.util.*;
public class Count_Function {
    static Scanner sc=new Scanner(System.in);
    public static void Count(int n)
    { int a, neg=0,zero=0,pos=0;
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(a<0)
            neg=neg+1;

            if(a==0)
            zero=zero+1;

            if(a>0)
            pos=pos+1;
            
        }
        System.out.println("Number of Positive Numbers: "+pos);
        System.out.println("Number of Negative Numbers: "+neg);
        System.out.println("Number of Zero Numbers: "+zero);
    }
    public static void main(String args[])
    { System.out.println("Enter the limit: ");
    int n=sc.nextInt();
    Count(n);


    }
}
