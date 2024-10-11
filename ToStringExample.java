package workout;

class StudentNew{
	private int id;
	private String name;
	private String location;
	
	public StudentNew() {
		
	}
	public  StudentNew(int id,String name,String location) {
		super();
		this.id=id;
		this.name=name;
		this.location=location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString(){
		return id+" "+name+" "+location;
	}
}


public class ToStringExample {
	public static void main(String[] args) {
		StudentNew s=new StudentNew(1, "Myna", "Theni");
		System.out.println(s);
	}
}
