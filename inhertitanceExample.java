package workout;

class plane{
	void takeoff() {
		System.out.println("Plane is taking off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}
class CargoPlane extends plane{
	void fly() {
		System.out.println("CargoPlane is flying at lowest height");
	}
	void carryCargo() {	//specialized methods
		System.out.println("CargoPlane carry cargo only");
	}
}
class PassengerPlane extends plane{
	void fly() {	//overridden method ,modification done on parent class
		System.out.println("PassengerPlane is flying moderate height");
	}
	void carryPassenger() {
		System.out.println("PassengerPlane carry Passenger only");
	}
}
class FighterPlane extends plane{
	void fly() {
		System.out.println("FighterPlane is flying at unbelivable heights");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry Weapons,Missiles,Bombs,..");
	}
}


public class inhertitanceExample {
	public static void main(String[] args) {
		CargoPlane c=new CargoPlane();
		PassengerPlane p=new PassengerPlane();
		FighterPlane f=new FighterPlane();
		
		c.takeoff();
		c.fly();
		c.carryCargo();
		c.land();
		System.out.println();
		
		p.takeoff();
		p.fly();
		p.carryPassenger();
		p.land();
		System.out.println();
		
		f.takeoff();
		f.fly();
		f.carryWeapons();
		f.land();
		
	}
}
