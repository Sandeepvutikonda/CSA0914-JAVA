import java.io.*;
import java.util.*;
class sal
{
int sal,g;
double bon,tsal;
void get_data()
{
Scanner s=new Scanner(System.in);
System.out.println("enter salary=");
sal=s.nextInt();
}
void cal()
{
Scanner s=new Scanner(System.in);
System.out.println("enter grade(1 means A grade/2 means B grade)=");
g=s.nextInt();
if(g==1)
{
if(sal<10000)
{
bon=0.07*sal;
tsal=sal+bon;
System.out.println("total salary="+tsal);
}
else
{
bon=0.05*sal;
tsal=sal+bon;
System.out.println("total salary="+tsal);
}
}
else if(g==2)
{
if(sal<10000)
{
bon=0.12*sal;
tsal=sal+bon;
System.out.println("total salary="+tsal);
}
else 
{
bon=0.10*sal;
tsal=sal+bon;
System.out.println("total salary="+tsal);
}
}
else
{
System.out.println("enter a valid grade");
}
}
}
class emp
{
public static void main(String args[])
{
sal a=new sal();
a.get_data();
a.cal();
}
}

