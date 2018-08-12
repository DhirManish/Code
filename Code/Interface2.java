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
	
		System.out.println("Ambiguous Function");
		
	}
	
	public void Show() {
		
		System.out.println("Extended");
		
	}

}	

public class Interface2 {
	
	public static void main(String[] args){
		
		Message msg = new Message();
		
		msg.print();
		
		msg.Show();
		
	}
	
}