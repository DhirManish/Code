//Final variable once initialized , value can neve be used

class FinalKey {

	final int value = 1;

}

public class FinalClass {

	public static void main(String[] args){
	
		FinalKey K = new FinalKey();
		
		System.out.println(K.value);
	
	}

}