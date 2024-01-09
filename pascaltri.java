import java.io.*;
import java.util.*;
class pascaltri
{
public static void main(String args[])
{
int rows=5,k=1;
for(int i=0;i<rows;i++)
{
for(int space=0;space<rows-i;++space)
{
System.out.print(" ");
}
for(int j=0;j<2*i-1;j++)
{
if(i==0 || j==0)
{
k=1;
}
else
{
k=k*(i-j+1)/j;
}
System.out.print(k);
}
System.out.println();
}
}
}
