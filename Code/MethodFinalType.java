class FinalMethod {

	final void method_final() {
		System.out.println("Finalized");
	}

}


class AnotherClass extends FinalMethod{
	
	void method_final(){
			System.out.println("Finalized");
	}
	
}

public class MethodFinalType {
	
	public static void main(String[] args){
		
		AnotherClass AC = new AnotherClass();
			
		AC.method_final();
		
	}
		
}