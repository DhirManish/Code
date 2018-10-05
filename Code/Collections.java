//https://www.javatpoint.com/collections-in-java.

import java.util.*;

public class Collections {
	
	public static void main(String[] args){
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ravi");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			
			System.out.print(itr.next());
			
		}
		
		LinkedList<String> aL = new LinkedList<String>();
		
		aL.add("Linked");
		
		Iterator<String> litr = aL.iterator();
		
		while(litr.hasNext()){
			
			System.out.println("\n" + litr.next());
			
		}
		
		Vector<String> vL = new Vector<String>();
		
		vL.add("Vector");
		
		Iterator<String> vitr = vL.iterator();
		
		while(vitr.hasNext()){
			
			System.out.println(vitr.next());
		
		}
		
		Stack<String> sL = new Stack<String>();
		
		sL.push("Stack");
		
		sL.push("Stack 1");
		
		//sL.pop(); -- pop does not print first element added to it
		
		Iterator<String> Sitr = sL.iterator();
		
		while(Sitr.hasNext()){
			
			System.out.println(Sitr.next());
			
		}
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("HashSet");
		
		set.add("HashSet1");
		
		set.add("HashSet");
		
		Iterator<String> Hitr = set.iterator();
		
		while(Hitr.hasNext()){
			
			System.out.println(Hitr.next());
			
		}
		
	}

}