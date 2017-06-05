import java.util.Scanner;

public class alpha
{
    public static void main(String mur[])
    {
        char ch;
        Scanner d = new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        ch = d.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
