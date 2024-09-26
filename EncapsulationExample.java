package workout;

//Normal program we can access the cid name no etcc,...bcz we can use public method.

/*class Customer{
	int id;
	String name;
	long no;
}


public class EncapsulationExample {
	public static void main(String[] args) {
		Customer c=new Customer();
		c.id=1;
		c.name="arya";
		c.no=97834710;
		System.out.println(c.id +" "+ c.name +" "+  c.no);
	}
}*/

//Encapsulation program

class Customer{
	private int id;
	private  String name;
	private  long no;
	
	public void setData(int id,String name,long no) {
		this.id=id;
		this.name=name;
		this.no=no;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public long getno() {
		return no;
	}
	
}


public class EncapsulationExample {
	public static void main(String[] args) {
		Customer c=new Customer();
		c.setData(1, "Arya" , 63793197);
		c.setData(2, "prakash" , 63793197);
		c.setData(3, "vijay" , 63793197);
		
		System.out.println(c.getid()+" "+c.getname()+" "+c.getno());
		
	}
}