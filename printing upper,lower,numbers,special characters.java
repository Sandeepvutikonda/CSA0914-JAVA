import java.io.*;
import java.util.*;
class uplns
{
public static void main(String args[])
{
String s1="Pr^aDep@12#3";
for(int i=0;i<=100;i++)
{
char ch=s1.charAt(i);
if (ch >= 'A' && ch <= 'Z')
{
System.out.println(ch+" is a upper case letter");
}
else if (ch >= 'a' && ch <= 'z')
{
System.out.println(ch+" is a lower case letter");
}              
else if (ch >= '0' && ch <= '9')
{
System.out.println(ch+" is a number");
}
else
{
System.out.println(ch+" is a special character");
} 
}
}
}           
