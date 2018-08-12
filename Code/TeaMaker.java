interface tea{

	void prepare_tea();

}

interface cookies {
	
	void Cookie();
	
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

class Combo implements tea, cookies{
	
	public void prepare_tea(){
		
		System.out.println("Tea is prepared");
		
	}
	
	public void Cookie(){
		
		System.out.println("Cookies");
		
	}
			
}


public class TeaMaker{
	
	public static void main(String[] args){
		
		tea LT = new Lemontea();
		
		LT.prepare_tea();
			
		tea GT = new GreenTea();

		GT.prepare_tea();
		
		tea tc = new Combo();
		
		tc.prepare_tea();
		
		cookies ck = new Combo();
		
		ck.Cookie();
		
	}
	
}