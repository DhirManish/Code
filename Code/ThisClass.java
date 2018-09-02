class Superwiththis{
	
	int id;
	
	String name;
	
	Superwiththis(int id, String name){
		
		this.id = id;
		
		this.name = name;
		
	}

}

class SubClass extends Superwiththis{
	
	float salary;
	
	SubClass(int id, String name,float salary){
		
		super(id,name);
		
		this.salary = salary;
		
	}
	
	void display(){
		
		System.out.println(id+" "+name+" "+salary);
		
	}
	
}

public class ThisClass{

	public static void main(String[] args){
		
		SubClass SC = new SubClass(1,"Manish",23f);
		
		SC.display();
		
	}

}