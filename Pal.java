import java.util.*;
class Pal
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String m=in.next();
        String k=new StringBuffer(m).reverse().toString();
        if(m.equals(k))
        {
         System.out.print("Palidrome");
        }
        else
        {
            System.out.print("Not Palidrome");
        }
    }
}

