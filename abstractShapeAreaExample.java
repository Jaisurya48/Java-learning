package workout;

import java.util.Scanner;

abstract class Shape{
	float area;
	
	abstract public void acceptInput();
	abstract public void calcArea();
	
	public void dispArea() {
		System.out.println(area);
	}
}
class Square extends Shape{
	private float side;
	
	public void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		side=scan.nextFloat();
	}
	
	public void calcArea(){
		area=side*side;
	}
}
class Rectangle extends Shape{
	private float Length;
	private float Breadth;
	
	public void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Length");
		Length=scan.nextFloat();
		System.out.println("Enter the Breadth");
		Breadth=scan.nextFloat();
	}
	
	public void calcArea() {
		area=Length*Breadth;
	}
}
class Circle extends Shape{
	private float radius;
	
	public void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius");
		radius=scan.nextFloat();
	}
	
	public void calcArea() {
		area=3.14f*radius*radius;
	}
}
class Geometry{
	public void permit(Shape ref) {
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}


public class abstractShapeAreaExample {
	public static void main(String[] args) {
		
		Square s=new Square();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		g.permit(s);
		g.permit(r);
		g.permit(c);
	}
	
	
}
