package workout;

abstract class bird{
	abstract void eat();
	abstract void fly();
}
abstract class eagle extends bird{
	void fly() {
		System.out.println("Eagle flys at higher mountains");
	}
}

class SerphentEagle extends eagle{
	void eat(){
		System.out.println("SerphentEagle eat snakes");
	}
}

class GoldenEagle extends eagle{
	void eat() {
		System.out.println("GoldenEagle eat fishes");
	}
}

public class abstractExample {
	public static void main(String[] args) {
		SerphentEagle se = new SerphentEagle();
		se.eat();
		se.fly();
		System.out.println("-------------------------------------");
		
		GoldenEagle ge = new GoldenEagle();
		ge.eat();
		ge.fly();
	}
	
}
