package murugavel;

import java.util.Scanner;

class Arr
{
   public static void main (String[] args)
   {		
       Scanner in =new Scanner(System.in);
       int n=in.nextInt();
       int k=in.nextInt();
       int array[]=new int[n];
       int j=0;
       for(int i=1;i<=n;i++)
       {
           array[j]=i;
           j++;
       }
       for(int i=n-1;i>k;i--)
       {
           System.out.print(array[i]+" ");
       }
       for(int i=0;i<=k;i++)
       {
           System.out.print(array[i]+" ");
       }
   }
}