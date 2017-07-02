package murugavel;

import java.util.Scanner;

class PrimeNumbers
{
   public static void main (String[] args)
   {		
       Scanner in =new Scanner(System.in);
       String workingdays=in.nextLine().toLowerCase();
       System.out.println(workingdays);
       if(workingdays.equals("monday") || workingdays.equals("tuesday") || workingdays.equals("wednesday") || workingdays.equals("thrusday") || workingdays.equals("friday"))
       {
           System.out.println("True");
       }
       else
       {
           System.out.println("False");}
   }
}