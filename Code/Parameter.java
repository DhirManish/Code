class FinalParam{

	int Square(final int n){
		
		//trying to change the finalized parameter value
		
		//n = n + 1;
		
		//adding the result of changes
		
		//Parameter.java:7: error: final parameter n may not be assigned
        //        n = n + 1;
        //        ^
		//1 error
		
		return n*n;
			
	}
	

}

public class Parameter{

	public static void main(String[] args){
		
		FinalParam FP = new FinalParam();
		
		System.out.println(FP.Square(2));
	
	}
	
}