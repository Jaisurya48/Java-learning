package workout;

public class stringbufferExample {
	public static void main(String[] args) {
		StringBuffer st=new StringBuffer("India is my country!");
		System.out.println(st);
		
		String t="vyt"
;
		t.indexOf(0)
		//String s=new String(st); both should be same
		String s=st.toString();
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		st.append("Indians");
		System.out.println(st);
		
		st.reverse();
		System.out.println(st);
		
		System.out.println(st.capacity());
		
		st.trimToSize();
		System.out.println(st);
		
	}
}
