import java.util.*;
class owerofDigit
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int k=in.nextInt();
        double mk=Math.pow(m,k);
        int md=(int)mk;
        System.out.print(md);
    }
}

