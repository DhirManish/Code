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

	public void loop(){
		
		int i;
		
		for (i = 1; i <= 10 ; i++) {
			
			System.out.println("Iteration : ");
			
			System.out.println(i);
			
			while (i < 5) {
			
				System.out.println("Entry Control Loop is running, Iteration : " + i);
				
				i++;
			}
		
			do {
			
				System.out.println("Exit Control loop is running, Iteration : " + i);
				
				i = i + 1;
				
			} while ( i <= 10);
			
		}
		
	}

	
}

class Flow_Control_Statement{
	
	
	
}

public class Basic_Statements{

	public static void main(String[] args){
		
		Conditional_statement cst = new Conditional_statement();
			
		Boolean bool = true;
		
		cst.CS(bool);
			
		Looping_statement LP = new Looping_statement();
		
		LP.loop();
		
		
		
	}

}