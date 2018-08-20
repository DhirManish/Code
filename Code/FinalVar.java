class Uninit_Var_Name {
	
	final String string_name;

	//results 
	
	//FinalVar.java:7: error: cannot assign a value to final variable string_name
    //            string_name = "Hello";
    //            ^
	//1 error
	
	//void message(){
	
		//string_name = "Hello";
		
	//}
	
	//initializing the final variable in constructor
	
	Uninit_Var_Name(){
		
		string_name = "Hello!!";
		
		System.out.println(string_name);
		
	}
	
}

public class FinalVar {

	public static void main(String[] args){ 
		
		new Uninit_Var_Name();
		
	}
	
}

