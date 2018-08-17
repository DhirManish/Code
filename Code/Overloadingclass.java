class Overloading {

	static int multiply(int a, int b){
		
		return a * b;
		
	}

}

public class Overloadingclass {

	public static void main(String[] args){
	
		Overloading OL = new Overloading();
		
		System.out.println(OL.multiply(10,10));
	
	}
	
}