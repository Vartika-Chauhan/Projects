import java.util.*;
class StudentGradeTracker
{
public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students:");
int n=sc.nextInt();
int a[]=new int[n];
int i;
System.out.println("Enter students' grades:");
for(i=0;i<n;i++)
{ System.out.println("Enter Student "+(i+1)+" grades:");
a[i]=sc.nextInt();
}
int sum=0;
for(i=0;i<n;i++)
{ sum=sum+a[i];
}
double avg=(double)sum/n;
int max=0,min=a[0];
for(i=0;i<n;i++)
{ if(a[i]>max)
{ max=a[i];
}
else
{ if(a[i]<min)
{ min=a[i];
}
}
}
System.out.println("Average marks:"+avg);
System.out.println("Maximum marks:"+max);
System.out.println("Minimum marks:"+min);
sc.close();
}
}
