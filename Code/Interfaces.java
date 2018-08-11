interface interface_22{
	
	void print();
	
}

class Interfaceimplementation implements interface_22{
	
	public void print(){
		
		System.out.println("Hello!! Interface");
	
	}
	
}

public class Interfaces{
	
	public static void main(String[] args){
		
		Interfaceimplementation In = new Interfaceimplementation();
		
		In.print();
		
	}

}