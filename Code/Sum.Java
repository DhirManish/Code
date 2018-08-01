class Hello{

	String s = "Hello";
	int c;

	public void sum(int a, int b){

		c = a + b;

		System.out.println(c);
	}

}

public class Sum{

	public static void main(String[] args){

		Hello dummy = new Hello();

		dummy.sum(1,2);

	}

}