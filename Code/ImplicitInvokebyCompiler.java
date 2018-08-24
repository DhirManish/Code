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
		
		//Result
		//D:\Code>java ImplicitInvokebyCompiler
		//Value 1
		//Value 2
		
	}

}