package Oops;

import java.util.Scanner;

public class TNEBbillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the Value of Units:");
int value=sc.nextInt();
int unit ;
int temp=value%10;
if(temp<=5)
	unit=value-temp;
else
	unit=value+(10-temp);
int temp1=unit-100;
int temp2=unit-200;
if(unit<=500)
{
	if(unit<=100)
		System.out.println("Free of Cost");
	else if(unit>100&&unit<=200)
		System.out.println("the amount is:"+temp1*2.25);
	else if(unit>200&&unit<=400)
		System.out.println("the amount is:"+(225+(temp2*4.5)));
	else
			System.out.println("the amount is:"+(1125+((unit-400)*6)));

}
else
{
	if(unit<=100)
		System.out.println("Free of Cost");
	else if(unit>100&&unit<=400)
		System.out.println("the amount is:"+temp1*4.5);
	else if(unit>400&&unit<=500)
		System.out.println("the amount is:"+(1350+((unit-400)*6)));
	else if(unit>500&&unit<=600)
		System.out.println("the amount is:"+(1950+((unit-500)*8)));
	else if(unit>600&&unit<=800)
		System.out.println("the amount is:"+(2750+((unit-600)*9)));
	else if(unit>800&&unit<=1000)
		System.out.println("the amount is:"+(4550+((unit-800)*10)));
	else
		System.out.println("the amount is:"+(6550+((unit-1000)*11)));
}

	}

}
