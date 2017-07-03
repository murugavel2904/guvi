import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int k=m/2;
        int count=0;
        for(int i=2;i<=k;i++)
        {
            if(m%i==0)
            {
                System.out.print("Not Prime");
                count=1;
            }
        }
        if(count==0)
        {
            System.out.print("Prime");
        }
    }
}

