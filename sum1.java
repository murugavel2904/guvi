import java.util.Scanner;

public class sum1
{
    public static void main(String mur[])
    {
    Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int sum=0;
	for(int i=1;i<=size;i++)
	{
	  sum=sum+i; 
	}
System.out.println("The sum of number"+sum);
    }
}
