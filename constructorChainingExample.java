package workout;



class Customer{
	private int id;
	private String name;
	private int phno;
	
	public Customer() {
		id=1;
		name="Fahad";
		phno=897688;
	}
	public Customer(int id,String name,int phno) {
		this();
		this.id=2;
		this.name="hii";
		this.phno=26383;
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
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	
}

public class constructorChainingExample {
	public static void main(String[] args) {
		Customer c1=new Customer(2,"arya",79988);
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getPhno());
	}
}
