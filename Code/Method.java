interface deafult_method{

	void method1(String Str1);

	default void log(String str1){
		
		System.out.println("Log : " + str1);
		
	}
	
}

class Implement_default_method implements deafult_method{
	
	@Override
	public void method1(String str1){
		
	}
	
	public void log(String str1){
		
		System.out.println("Class Logging :" + str1);
		
	}
	
}

public class Method{
	
	public static void main(String[] args){
		
		Implement_default_method IDM = new Implement_default_method();
		
		IDM.method1("Hello");
		
		IDM.log("Sample log");
		
	}

}