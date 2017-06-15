import static java.lang.System.in;
import java.util.Arrays;
import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner m=new Scanner(System.in);
      int size=m.nextInt();
      int arr1[]=new int[size];
      int sum=0;
      //int n=number/2;
      for(int i=0;i<arr1.length;i++)
      {
          arr1[i]=m.nextInt();
      }
      for(int i=0;i<arr1.length;i++)
      {
          for(int j=0;j<arr1.length;j++)
          {
              for(int k=0;k<arr1.length;k++)
              {
                 sum+=arr1[i]+arr1[j];
                 if(sum==arr1[k])
                 {
                     System.out.println(arr1[i]+" "+arr1[j]);
                 }
  
              }
          }
      }
         
    }
    
}
