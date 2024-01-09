import java.io.*;
import java.util.*;
class atm
{
public static void main(String args[])
{
int avail,bal,sum,a,b,c,d,wit;
Scanner s=new Scanner(System.in);
System.out.println("enter available balance=");
avail=s.nextInt();
System.out.println("enter withdraw ammount=");
wit=s.nextInt();
System.out.println("enter no of 2000 notes=");
a=s.nextInt();
System.out.println("ammount with 2000 notes="+(2000*a));
System.out.println("enter no of 500 notes=");
b=s.nextInt();
System.out.println("ammount with 500 notes="+(500*b));
System.out.println("enter no of 200 notes=");
c=s.nextInt();
System.out.println("ammount with 200 notes="+(200*c));
System.out.println("enter no of 100 notes=");
d=s.nextInt();
System.out.println("ammount with 100 notes="+(100*d));
sum=(2000*a)+(500*b)+(200*c)+(100*d);
if(sum != wit)
{
System.out.println("enter correct denominations");
}
else
{
bal=avail-wit;
System.out.println("balance amount="+bal);
}
}
}




