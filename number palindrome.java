import java.io.*;
import java.util.*;
class pali
{
public static void main(String args[])
{
int sum=0,rem,n,temp;
Scanner s=new Scanner(System.in);
System.out.println("enter a number=");
n=s.nextInt();
temp=n;
while(n!=0)
{
rem=n%10;
sum=sum*10+rem;
n/=10;
}
System.out.println("reverse number="+sum);
if(sum==temp)
{
System.out.println(temp+" is a palindrome");
}
}
}
