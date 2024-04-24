import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		int num,r,sum=0,num1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your number");
		num=sc.nextInt();
		num1=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+ r;
			num=num/10;
		}		
		System.out.println("The sum of digit is ="+sum);


	}

}
