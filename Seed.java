import java.util.*;
class Seed
{
    public static void main(String mur[])
    {
       Scanner in=new Scanner(System.in);
       int X=in.nextInt();
       int Y=in.nextInt();
       int num=X;
       while(X>0)
       {
           int d=X%10;
           X=X/10;
           num=num*d;
       }
       if(num==Y)
       {
           System.out.print("seed");
       }
      
    }
}


