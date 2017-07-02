package murugavel;

import java.util.Scanner;

class PrimeNumbers
{
   public static void main (String[] args)
   {		
       Scanner in =new Scanner(System.in);
       int i =0;
       int range=in.nextInt();
       int num;
       String  primeNumbers = "";

       for (i = 1; i <=range; i++)         
       { 		  	  
          int count=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		count = count + 1;
	     }
	  }
	  if (count ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers are :");
       System.out.println(primeNumbers);
   }
}