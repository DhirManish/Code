class FinalParam{

	int Square(final int n){
		
		return n*n;
			
	}
	

}

public class Parameter{

	public static void main(String[] args){
		
		FinalParam FP = new FinalParam();
		
		System.out.println(FP.Square(2));
	
	}
	
}