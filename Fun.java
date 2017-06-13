import java.util.Scanner;
public class Fun {
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in=new Scanner(System.in);
       String str1=in.nextLine();
       murugavell(str1);
    }
    public static void murugavell(String str1)
    {
      String str2=new StringBuffer(str1).reverse().toString();
       System.out.print(str2);    
    }
    
}
