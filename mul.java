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
           long d=Long.parseLong(a);
           long s=Long.parseLong(b);
           long z=0;
           if(d>0 && s>0)
             z=d*s;
           String y=String.valueOf(z);
           return y;
       }
}
