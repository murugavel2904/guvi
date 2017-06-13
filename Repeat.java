import java.util.Arrays;
import java.util.Scanner;
public class Repeat {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c=0;
        int size=in.nextInt();
        int arr[]=new int[size];
        int count=0;
        for(int i=0;i<size;i++)
            arr[i]=in.nextInt();
       // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {   for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j]&&count==0)
                {
                    System.out.println(""+arr[i]);
                    count++;
                    
                  
                }}}
    }
}
