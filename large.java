import java.util.*;
import java.util.Scanner;
public class large
{
public static void main(String mur[])
{

Scanner in=new Scanner(System.in);
int m,n,o;
System.out.println("Enter the First Number");
m=in.nextInt();
System.out.println("Enter the Second Number");
n=in.nextInt();
System.out.println("Enter the Third Number");
o=in.nextInt();
if(m>n && m>o)
System.out.println(" First Number is a Largest Number");
else if(n>m && n>o)
System.out.println("Second Number is a Largest Number");
else
{
System.out.println("Third Number is a Largest Number"); 
}
}
}
