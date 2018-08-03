import java.util.*;

class Lists {
	
	List<Integer> A = new ArrayList();
	List L = new LinkedList();
	List V = new Vector();
	List S = new Stack();

}

class Implement_List extends Lists {
	
	public void add_integer_to_list(){
	
		A.add(1);
		
		System.out.println(A);

	}
	
}

public class ListClass {
	
	public static void main(String[] args){
	
		Lists ls = new Lists();
		
		Implement_List IL = new Implement_List();
		
		IL.add_integer_to_list();
		
	}

}