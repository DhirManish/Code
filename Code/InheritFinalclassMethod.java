class FinalClass_Method {
	
	final void work() {
		
		String message = "Working";
		
	}

}


class Inherit_FinalClass_Method {

	void print_message() {
		
		System.out.println(message);
		
	}

}

public class InheritFinalclassMethod {

	public static void main(Sting[] args){
	
		FinalClass_Method FC = new FinalClass_Method();
		
		FC.work();
		
		InheritFinalclassMethod IFCM = new InheritFinalclassMethod();
		
		IFCM.print_message();
			
		
	}
	
}