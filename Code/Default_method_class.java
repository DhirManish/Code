interface Default_interface {

	void declare_msg_function();
	
	default void msg() {
	
		System.out.println("Default message");
		
	}
	
	
}

class imp implements Default_interface{

	public void declare_msg_function(){
	
		System.out.println("Function Initialized");
		
	}
	
}

public class Default_method_class{
	
	public static void main(String[] args){
		
		imp i = new imp();
		
		i.declare_msg_function();
		
		i.msg();
			
	}
	
}