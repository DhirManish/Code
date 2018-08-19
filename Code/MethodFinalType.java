class FinalMethod {

	final void method_final() {
		System.out.println("Finalized");
	}

}

//cannot override the final method_final

//MethodFinalType.java:11: error: method_final() in AnotherClass cannot override method_final() in FinalMethod
     //   void method_final(){
    //         ^
  //overridden method is final
//1 error

class AnotherClass extends FinalMethod{
	
//	void method_final(){
		//	System.out.println("Finalized");
	//}
	
}

public class MethodFinalType {
	
	public static void main(String[] args){
		
		AnotherClass AC = new AnotherClass();
			
		//AC.method_final();
		
		FinalMethod FM = new FinalMethod();
		
		FM.method_final();
		
	}
		
}