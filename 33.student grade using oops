import java.io.*;
import java.util.*;
class student
{
int reg,m1,m2,m3,m4,m5,tot;
double avg;
String name;
void get_data()
{
Scanner s=new Scanner(System.in);
System.out.println("enter name,reg no,5 sub marks=");
name=s.nextLine();
reg=s.nextInt();
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
m4=s.nextInt();
m5=s.nextInt();
}
void cal()
{
if(m1<50 || m2<50 || m3<50 || m4<50 || m5<50)
{
System.out.println(name+ "is fail");
}
else
{
tot=m1+m2+m3+m4+m5;
avg=tot/5;
}
}
void grade()
{
if(avg>=90)
{
System.out.println(name+ " GRADE IS A+");
}
else if(avg>=80 && avg<90)
{
System.out.println(name+ " GRADE IS A");
}
else if(avg>=70 && avg<80)
{
System.out.println(name+ " GRADE IS B");
}
else if(avg>=60 && avg<70)
{
System.out.println(name+ " GRADE IS C");
}
else if(avg>=50 && avg<60)
{
System.out.println(name+ " GRADE IS D");
}
else
{
System.out.println(name+ "is fail");
}
}
}
class newgrade
{
public static void main(String args[])
{
student a=new student();
a.get_data();
a.cal();
a.grade();
}
}
