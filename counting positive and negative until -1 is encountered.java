import java.io.*;
import java.util.*;
class pos
{
public static void main(String[] args) 
{
Scanner s = new Scanner(System.in);
int p= 0,k=0;
System.out.println("Enter numbers (enter -1 to stop):");
int n=s.nextInt();
while (n!= -1)
{
if(n>0)
{
p++;
}
else if(n< 0) 
{
k++;
}
n=s.nextInt();
}
System.out.println("Positive numbers: " + p);
System.out.println("Negative numbers: " + k);
}
}
