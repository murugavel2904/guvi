import java.util.Scanner;

public class sum
{
    public static void main(String mur[])
    {
    Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    
    int sum=0;
	    if(size>0)
	    {
for(int i=0;i<size;i++)
{
  sum=sum+i; 
	}
System.out.println("The sum of number"+sum);
	    }
		    else
    {
	    System.out.println("Size must be greater than zero");
    }
	    }
}
