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

