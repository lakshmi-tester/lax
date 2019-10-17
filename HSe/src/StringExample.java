
public class StringExample {
	
	public static String s = "Ramesh";
	public static 	String s1 = "Babu";
	
	public String toString() {
		return s+s1;
		
	}
	
	public String toString1() {
		return s.concat(s1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExample se = null;
		StringExample sq = new StringExample();
		System.out.println(se);
		System.out.println(sq);
		

	}

}
