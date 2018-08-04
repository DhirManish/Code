abstract class AbstractClass {
	
	String S = " Hello Abstract Class ";
	
	AbstractClass(){
		
		this.S = S;
		
	}
	
	public void AbstractMethod() {

		System.out.println(this.S);
	
	}
	
}

class NormalClass extends AbstractClass {
	
	int i;
	
	NormalClass(){

		this.i = i;
	
	}	
	
	public void length(){
		
		i = S.length();
		
		System.out.println(i);
		
	}
	
}

public class Abstracted {
	
	public static void main(String[] args){
		
		NormalClass N = new NormalClass();
		
		N.AbstractMethod();
		
		N.length();
		
	}
	
}