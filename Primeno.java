//Write a program to accept a no from user and check it is prime or not

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		int num, i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
	
		for(i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				break;
			}
		}
		if(num==i)
		{
			System.out.println("The given no is Prime no..."+num);
		}
		else
		{
			System.out.println("The given no is Not Prime no..."+num);
		}
	}

}
