import java.util.Scanner;

public class Else_if_demo {

	public static void main(String[] args) {
		int choice, num1, num2, res;
		Scanner sc=new Scanner(System.in);
		System.out.println("1. ADD\n2. SUB\n3. MUL\n4.DIV\n5.MOD");
		System.out.println("Enter your choice: ");
		choice=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter 2 numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			res=num1+num2;
			System.out.println("Add is: "+res);
		}
		else if(choice==2)
		{
			System.out.println("Enter 2 numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			res=num1-num2;
			System.out.println("Sub is: "+res);
		}
		else if(choice==3)
		{
			System.out.println("Enter 2 numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			res=num1*num2;
			System.out.println("Mul is: "+res);
		}
		else if(choice==4)
		{
			System.out.println("Enter 2 numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			res=num1/num2;
			System.out.println("Div is: "+res);
		}
		else if(choice==5)
		{
			System.out.println("Enter 2 numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			res=num1%num2;
			System.out.println("Mod is: "+res);
		}
		else 
		{
			System.out.println("");
		}
	}

}
