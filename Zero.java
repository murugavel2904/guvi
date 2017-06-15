import java.util.Arrays;
import java.util.Scanner;
public class Zero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner m=new Scanner(System.in);
        int size=m.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
            arr[i]=m.nextInt();
        Arrays.sort(arr);
        int e=arr[0]+arr[1];
        System.out.println("The nearest number closet to zero="+arr[0]+" "+arr[1]);
    }
    
}
