import java.io.*;
import java.util.*;
class pas
{
public static void main(String args[])
{
int rows=5,k=0;
for(int i=1;i<=rows;i++)
{
for(int space=1;space<=rows-i;space++)
{
System.out.print(" ");
}
for(int j=i; j <= 2 * i - 1; ++j) 
{
System.out.print("* ");
}
for(int j = 0; j < i - 1; ++j) 
{
System.out.print("* ");
}
System.out.println();
}
}
}

