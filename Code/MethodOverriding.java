class Overriding{

	int sum (int a, int b){
		
		return a + b;
	
	}
	
}

class Method2 extends Overriding {
	
	double sum (double a, double b){
	
		return a + b;
		
	}
	
}

public class MethodOverriding {
	
	public static void main(String[] args){
	
		Overriding OV = new Overriding();
		
		System.out.println(OV.sum(1, 2));
		
		Method2 M = new Method2();
		
		System.out.println(M.sum(1.0, 2.0));

	}
	
}
	