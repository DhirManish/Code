//Final variable once initialized , value can neve be used

class FinalKey {

	final int value = 1;
	
	//trying to reinitialize the value keyword
	
	//void reinit(){
		
		//value = 2;
		
	//}
	
	//FinalClass.java:11: error: cannot assign a value to final variable value
    //            value = 2;
    //            ^
	//1 error
}

public class FinalClass {

	public static void main(String[] args){
	
		FinalKey K = new FinalKey();
		
		System.out.println(K.value);
		
		//K.reinit();
	
	}

}