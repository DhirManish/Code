import java.util.*;
import java.io.*;
import java.lang.*;

class class_for_reuseable_method_string_operations_under_dev{

	String s = "Hello";
	
	public void reverse(){
		
		byte[] strunderaction = s.getBytes();
		
		byte[] result = new byte [strunderaction.length];
		
		for(int i = 0; i < strunderaction.length; i++)
			result[i] =strunderaction[strunderaction.length-i-1];
		
		System.out.println("reverse of " + s + "is : " + new String(result));
		
	}
	
	public void Repeated_character_in_String_using_Byte(){
		
		String under_action = "Reverse";
		
		byte[] strbytes = under_action.getBytes();
		
		byte[] result_str = new byte [strbytes.length];
		
		byte[] temp = new byte [strbytes.length];
		
		for(int j = 0; j < strbytes.length; j++){
				
			if (strbytes[j] == 'e') {
				
				temp[j] = strbytes[j];
				
				//System.out.println(new String(temp));

				//System.out.println(new String(strbytes));	
				
			}
		
		}
		
		System.out.println(new String(strbytes));	
			
		System.out.println(new String(temp));
		
	}
	

}

public class Reusability{
	
	public static void main(String[] args){
		
		class_for_reuseable_method_string_operations_under_dev c = new class_for_reuseable_method_string_operations_under_dev();
		
		c.reverse();
		
		c.Repeated_character_in_String_using_Byte();
	}
	
}