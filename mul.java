import java.util.*;
class mul
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String m=in.next();
        String k=in.next();
        String sa=mur(m,k);
        System.out.print(sa);
       }
      public static String mur(String a,String b)
       {
           int d=Integer.parseInt(a);
           int s=Integer.parseInt(b);
           int z=d*s;
           String y=String.valueOf(z);
           return y;
       }
}
