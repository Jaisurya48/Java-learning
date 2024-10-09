package workout;

import java.util.Scanner;

class Businessman
{
	private float si;
	private float p;
	private float t;
	static private float r;
	static {
		r=15.2f;
	}

public void acceptInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the principal amount: ");
	p=scan.nextFloat();
	System.out.println("Enter the tenure: ");
	t=scan.nextFloat();
	
}
public void calculate()
{
	si=(p*t*r)/100;
}
public void disp()
{
	System.out.println("The simple interest is: "+si);
}
}


public class SimpleInterestStaticProblem {
	public static void main(String[] args) {
		Businessman b1=new Businessman();
		b1.acceptInput();
		b1.calculate();
		b1.disp();
	}
}
