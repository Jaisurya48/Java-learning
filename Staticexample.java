package workout;

class Test{
	//static variables
	static int a,b;
	//static block
	static
	{
		System.out.println("Inside the static block");
		a=10;
		b=20;
	}
	//static method
	static void fun1()
	{
		System.out.println("Inside the static method");
	}
	
	//instance variable
	int x,y;
	//instance block
	{
		System.out.println("Inside the instance block");
	}
	//instance method
	void fun2()
	{
		System.out.println("Inside the instance method");
	}
	//constructors
	Test()
	{
		System.out.println("Inside the constructors");
		x=30;
		y=40;
	}
}


public class Staticexample {
	public static void main(String[] args) {
		Test.fun1();
		Test t=new Test();
		t.fun2();
	}
}
