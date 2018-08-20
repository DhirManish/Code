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
	
}

public class FinalVar {

	public static void main(String[] args){
	
		Uninit_Var_Name UV = new Uninit_Var_Name();
		
		UV.message();
		
	}
	
}

