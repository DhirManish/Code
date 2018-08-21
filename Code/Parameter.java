class FinalParam{

	int Square(final int n){
		
		//trying to change the finalized parameter value
		
		n = n + 1;
		
		return n*n;
			
	}
	

}

public class Parameter{

	public static void main(String[] args){
		
		FinalParam FP = new FinalParam();
		
		System.out.println(FP.Square(2));
	
	}
	
}