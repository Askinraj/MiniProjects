package Oops;

import java.util.Scanner;

public class TNEBbillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter the Value of Units:");
Float unit=sc.nextFloat();
if(unit<=100)
	System.out.println("Free of Cost");
else if(unit>100&&unit<=400)
	System.out.println("the EB bill is="+String.format("%.2f", unit*4.50));
else if(unit>400&&unit<=500)
	System.out.println("the EB bill is="+String.format("%.2f", unit*6));
else if(unit>500&&unit<=600)
	System.out.println("the EB bill is="+String.format("%.2f", unit*8));
else if(unit>600&&unit<=800)
	System.out.println("the EB bill is="+String.format("%.2f", unit*9));
else if(unit>800&&unit<=1000)
	System.out.println("the EB bill is="+String.format("%.2f", unit*10));
else
	System.out.println("the EB bill is="+String.format("%.2f", unit*11));

	}

}
