class SuperMethod {
	
	void Method1(){
		
		System.out.println("Super Class's Method");
		
	}

}

class AnotherMethod extends SuperMethod {
	
	void Method1() {
		
		//System.out.println("Method called from AnotherMethod class");
		
	}
	
	void AMehtod() {
		
		System.out.println("Method Class");
		
	}
	
	void Method2() {
		
		super.Method1();
		
		AMehtod();
		
	}
	
}

public class MainClass {

	public static void main(String[] args){
		
		AnotherMethod AM = new AnotherMethod();
		
		AM.Method2();
		
	}

}