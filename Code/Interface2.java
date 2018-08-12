interface Print {

	void print();
	
}

interface PrintMsg {

	void print();
	
}
	
class Message implements Print, PrintMsg{

	public void print() {
	
		System.out.println("Hello");
		
	}

}	

public class Interface2 {
	
	public static void main(String[] args){
		
		Message msg = new Message();
		
		msg.print();
	
	}
	
}