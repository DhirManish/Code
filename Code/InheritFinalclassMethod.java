class FinalClass_Method {

	
	final String work(){
		
		return "Working";
		
	}

}


class Inherit_FinalClass_Method extends FinalClass_Method {

	void print_message() {
		
		FinalClass_Method FMC = new FinalClass_Method();
		
		System.out.println(FMC.work());
		
	}

}

public class InheritFinalclassMethod {

	public static void main(String[] args){
	
		FinalClass_Method FC = new FinalClass_Method();
		
		FC.work();
		
		Inherit_FinalClass_Method IFCM = new Inherit_FinalClass_Method();
		
		IFCM.print_message();
			
	}
	
}