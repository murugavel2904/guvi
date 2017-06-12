import java.util.*;
class Postion
{
    public static void main(String mur[])
    {
       Scanner in=new Scanner(System.in);
       int size=in.nextInt();
       int arr[]=new int[size];
       if(size>0)
       {
            for(int i=0;i<size;i++)
            {
                arr[i]=in.nextInt();
            }
            murugavel(arr,size);
       }
        else
        System.out.print("0");
    }
    public static void murugavel(int arr[],int size)
    {
       Arrays.sort(arr);
       for(int i=0;i<size;i++)
       {
           if(i==arr[i]);
           {
           System.out.println(arr[i]);
           }
        }
           
         
      
    }
}


