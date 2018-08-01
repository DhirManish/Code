
class Practice {
	
	int c;
	
	public void Sum(int a, int b){
		
		c = a + b;
		System.out.println(c);
		
	}
	
}

public class Class1 {

	String a = "String";
	
	public static void main(String[] args){
		
		Practice practice = new Practice();
		
		practice.Sum(1, 2);
		
	}
	
}
