import java.util.*;
class NumberofDigit
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int k=Math.abs(m);
        int count=0;
        if(k==0)
        {
            count=1;
        }
        else
        {
            while(k>0)
            {
                k=k/10;
                count++;
            }
        }
        System.out.print(count);
    }
}

