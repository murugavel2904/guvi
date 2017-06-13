import java.util.Arrays;
import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int c=0;
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=in.nextInt();
        Arrays.sort(arr);
        int d=arr[0]+arr[1];
                    System.out.println(d);
              
    }
}
