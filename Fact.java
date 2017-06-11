import java.util.*;
class Fact
{
    public static void main(String mur[])
    {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int fact=1;
        for(int i=number;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.print(fact);
        
    }
}
