class Uninit_Var_Name {
	
	final String string_name;


	void message(){
	
		string_name = "Hello";
		
	}
	
}

public class FinalVar {

	public static void main(String[] args){
	
		Uninit_Var_Name UV = new Uninit_Var_Name();
		
		UV.message();
		
	}
	
}

