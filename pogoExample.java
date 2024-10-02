package workout;

import java.util.Scanner;

class Student
{
	private int id;
	private String name;
	private float height;
	private String address;
	
//Zero parameterized constructor
public Student()
{
	
}
//parameterized constructor
public Student(int id,String name,float height,String address)
{
	this.id=id;
	this.name=name;
	this.height=height;
	this.address=address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
public class pogoExample {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Student: ");
		int n=scan.nextInt();
		scan.nextLine();
		Student []a=new Student[n];
		
		for(int i=0; i<=n-1; i++) {
			Student s=new Student();
			System.out.println("Enter the details for "+(i+1)+ " person ");
			String details=scan.nextLine();
			String []arr=details.split(",");
			int id=Integer.parseInt(arr[0]);
			float height=Float.parseFloat(arr[2]);
			
			s.setId(id);
			s.setName(arr[1]);
			s.setHeight(height);
			s.setAddress(arr[3]);
			a[i]=s;
			
			
		}
		
		for(Student b:a) {
			System.out.println(b.getId()+" "+b.getName()+" "+b.getHeight()+" "+b.getAddress());
		}
		
	}
}
