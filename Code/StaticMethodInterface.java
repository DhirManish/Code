interface staticmethod{

	void printmsg();
	
	static int square(int x) {

		return x * x;
		
	}

}

class message implements staticmethod{
	
	public void printmsg(){
		
		System.out.println("Square ");
	
	}
	
}

public class StaticMethodInterface{
	
	public static void main(String[] args){
	
		staticmethod msg = new message();
	
		msg.printmsg();
		
		System.out.println(staticmethod.square(4));
	
	}
	
	
}