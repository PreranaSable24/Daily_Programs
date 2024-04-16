//import java.util.Scanner;
//
//public class If_demo {
//
//	public static void main(String[] args) 
//	{
//		int num, res=0;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter a number:");
//		num=sc.nextInt();
//		
//		if(num>0)
//		{
//			res=num*num;
//			System.out.println("The Square is ="+res);
//
//		}
//		else
//		{
//			System.out.println("Please enter only positive number...");
//		}
//	}
//
//}

import java.util.Scanner;
public class If_demo {

	public static void main(String[] args) 
	{
		int num1, num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		num1=sc.nextInt();
		System.out.println("Enter second number:");
		num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("num1 is greater than num2: "+num1);

		}
		else
		{
			System.out.println("num2 is greater than num1: "+num2);
		}
	}

}