import java.util.*;
import java.util.Scanner;
public class leap
{
public static void main(String mur[])
{

Scanner in=new Scanner(System.in);
int m;
System.out.println("Enter the Year");
m=in.nextInt();
if(m%400==0)
System.out.println("The Year is Leap Year");
else
System.out.println("The Year is Not Leap Year");

}
}
