import java.io.*;
import java.util.*;
class palin
{
public static void main(String args[])
{
String a="rajarm",reve="",temp;
int l=a.length();
temp=a;
for(int i=l-1;i>=0;i--)
{
char ch=a.charAt(i);
reve=reve+ch;
}
System.out.println("reversed string="+reve);
if(a.equals(reve))
{
System.out.println(a+" is a palindrome");
} 
else
{
System.out.println(a+" is not a palindrome");
}
}
}
