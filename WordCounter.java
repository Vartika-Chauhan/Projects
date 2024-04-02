import java.util.*;
public class WordCounter
{
public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
    String str;
    System.out.println("Enter the sentence: ");
    str=sc.nextLine();
str=" "+str;
char ch;
int c=0,i;
for(i=0;i<str.length();i++)
{  ch=str.charAt(i);
if(ch==' ')
{ c=c+1;
}
}
System.out.println("The number of words in the given sentence is: "+c);
}
}