class Staticfinalvar{

	static final int data;
	
	static {
		
		data = 50;
		
	}
	
}

public class StaticVariable{

	public static void main(String[] args){
	
		Staticfinalvar SFV = new Staticfinalvar();
		
		System.out.println(SFV.data);
		
	
	}

}