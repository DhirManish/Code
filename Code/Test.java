class ParentClass {

	ParentClass() {
	
		System.out.println("Parent constructor");
		
	}

}

class Childclass extends ParentClass {
	
	Childclass(){
		
		super();
		
		System.out.println("Child Class");
	
	}
	
}

public class Test {
	
	public static void main(String[] args){
		
		Childclass CC = new Childclass();
	
	}

}