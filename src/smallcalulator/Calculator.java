package smallcalulator;
import java.util.Scanner;
public class Calculator {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		double a;
		double b;
		String operation;
		System.out.println("Enter the opertor( + , - , * , /  )");
		operation=scan.next();
		System.out.println("ENTER TWO NUMBERS");
		a=scan.nextDouble();
		b=scan.nextDouble();
		
       scan.close();
       switch(operation)
       {
       case "+":
    	   System.out.println(a+b);
    	   break;
       case"-":
    	   System.out.println(a-b);
    	   break;
       case"*":
    	   System.out.println(a*b);
    	   break;
       case"/":
    	   System.out.println(a/b);
    	   break;
    	default:
    		System.out.println("invalid option Entered");
    		break;
       }
	}
}

