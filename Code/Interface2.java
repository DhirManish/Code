interface Print {

	void print();
	
}

interface PrintMsg {

	void print();
	
}

interface Show extends Print {
	
	void Show();
	
}
	
class Message implements Print, PrintMsg, Show{

	public void print() {
	
		System.out.println("Hello");
		
	}
	
	public void Show() {
		
		System.out.println("Welcome");
		
	}

}	

public class Interface2 {
	
	public static void main(String[] args){
		
		Message msg = new Message();
		
		msg.print();
		
		msg.Show();
		
	}
	
}