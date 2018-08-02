class Conditional_statement {
	
	String sw;
	
	public void makeswitch(){
		
		switch (sw) {
			
			case "If" :
				System.out.println("If statement");
				break;
			case "else" :
				System.out.println("Else statement");
				break;
			default :
				System.out.println("default");
				break;
		}
		
	}
	
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
	
	int [] number = {10,11,12,13,14};
	
	public void Control_n_foreach(){
	
		for ( int x : number ) {
			if ( x == 11) {
				continue;
			}
		System.out.println(x);
		System.out.println("\n");
		}
	}
}

public class Basic_Statements{

	public static void main(String[] args){
		
		Conditional_statement cst = new Conditional_statement();
			
		Boolean bool = true;
		
		cst.CS(bool);
			
		Looping_statement LP = new Looping_statement();
		
		LP.loop();
		
		cst.sw = "If";
			
		cst.makeswitch();
			
		Flow_Control_Statement FCS = new Flow_Control_Statement();
		
		FCS.Control_n_foreach();
		
	}

}