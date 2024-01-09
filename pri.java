
import java.io.*;
import java.util.*;
public class pri 
{
public static void main(String[] args) 
{
int count; 
int a[]=new int[50];
int n,p=0,c=0;
Scanner s=new Scanner(System.in);
System.out.println("enter no of elements in array=");
n=s.nextInt();
System.out.println("enter "+n+" elements=");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for (int i = 0; i < n; i++) 
{
count = 0;  
for (int j = 2; j <= a[i] / 2; j++) 
{
if (a[i] % j == 0) 
{
count++; 
c++; 
System.out.println(a[i]+" is a composite number");
break; 
}
else if (count == 0)
{
p++;
System.out.println(a[i]+" is a prime number");
break;
}
}
}
System.out.println("number of composite numbers="+c);
System.out.println("number of prime numbers="+p);
}
}
