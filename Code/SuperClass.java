class SuperKey {

	String color = "Black";

}

class ChildKey extends SuperKey {
	
	String color = "White";
	
	void Printcolor(){
		
		System.out.println(color);
		
		System.out.println(Super.color);
		
	}
	
}


public class SuperClass {

	public static void main(String[] args){
		
		ChildKey CK = new ChildKey();
		
		CK.Printcolor();
		
	}


}