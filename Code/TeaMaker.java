interface tea{

	void prepare_tea();

}

class Lemontea implements tea{
	
	public void prepare_tea() {
		
		System.out.println("Lemon Tea is prepared");
	
	}
	
}

public class TeaMaker{
	
	public static void main(String[] args){
		
		tea T = new Lemontea();
		
		T.prepare_tea();
		
	}
	
}