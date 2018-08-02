class Conditional_statement {

	public Boolean CS(Boolean b){
		
		if (b){
			System.out.println("TRUE");
			return true;
		}
		else if (!b){
			System.out.println("FALSE");
			return false;
		}
		else{
			System.out.println("FALSE");
			return false;
		}
	}
	
}

class Looping_statement{

	
	
}

class Flow_Control_Statement{
	
	
	
}

public class Basic_Statements{

	public static void main(String[] args){
		
		Conditional_statement cst = new Conditional_statement();
			
		Boolean bool = true;
		
		cst.CS(bool);
		
	}

}