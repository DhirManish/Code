interface tea{

	void prepare_tea();

}

class Lemontea implements tea{
	
	public void prepare_tea() {
		
		System.out.println("Lemon Tea is prepared");
	
	}
	
}

class GreenTea implements tea{
	
	public void prepare_tea() {
		
		System.out.println("Green Tea is prepared");
		
	}
	
}

public class TeaMaker{
	
	public static void main(String[] args){
		
		tea LT = new Lemontea();
		
		LT.prepare_tea();
			
		tea GT = new GreenTea();

		GT.prepare_tea();
		
	}
	
}