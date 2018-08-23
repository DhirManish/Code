class Implicit{
	
	Implicit(){
		
		System.out.println("Value 1");
		
	}

}

class Practitioner extends Implicit{
	
	Practitioner(){
		
		System.out.println("Value 2");
		
	}
	
}

public class ImplicitInvokebyCompiler{

	public static void main(String[] args){
		
		Practitioner pr = new Practitioner();
		
	}

}