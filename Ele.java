import java.util.*;
class Ele
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String m=in.nextLine();
        int d=in.nextInt();
        String[] k=m.split(" ");
        String a="";
        for(int i=d-1;i<k.length;i++)
        {
            System.out.print(k[i]+" ");
        }
        for(int i=0;i<d;i++)
        {
             System.out.print(k[i]);
             if(i<d-1)
             {
             System.out.print(" ");

             }

        }
    }
}
