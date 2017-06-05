import java.util.Scanner;

public class sum
{
    public static void main(String mur[])
    {
    Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int[size];
    int sum=0;
for(int i=0;i<size;i++)
{
arr[i]=in.nextInt();
}
	for(int i=0;i<size;i++)
	{
	  sum=sum+arr[i]; 
	}
System.out.println("The sum of number"+sum);
    }
}
