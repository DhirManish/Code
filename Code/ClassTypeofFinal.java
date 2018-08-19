final class FinalClass {

	void FC_Method(){
		
		System.out.println("Working");
		
	}
	
}


class childclass extends FinalClass{
	
	void run(){ 
	
		System.out.println("this won't be working");
		
	}
	
}

public class ClassTypeofFinal {

	public static void main(String[] args){
		
		FinalClass FC = new FinalClass();
		
		FC.FC_Method();
		
		childclass cc = new childclass();
		
		cc.run();
		
	}

}