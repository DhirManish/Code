import java.util.*;
import java.io.*;
import java.lang.*;

class class_for_reuseable_method_string_operations_under_dev{

	String s = "Hello";
	
	static String under_action = "Reverse";
	
	public void reverse(){
		
		byte[] strunderaction = s.getBytes();
		
		byte[] result = new byte [strunderaction.length];
		
		for(int i = 0; i < strunderaction.length; i++)
			result[i] =strunderaction[strunderaction.length-i-1];
		
		System.out.println("reverse of " + s + "is : " + new String(result));
		
	}
	
	public void Repeated_character_in_String_using_Byte(char c){
		
		byte[] strbytes = under_action.getBytes();
		
		byte[] result_str = new byte [strbytes.length];
		
		byte[] temp = new byte [strbytes.length];
		
		for(int j = 0; j < strbytes.length; j++){
				
			if (strbytes[j] == c) {
				
				temp[j] = strbytes[j];
				
			}
		
		}
			
		System.out.println(new String(temp));
		
	}
	
	public static String PrintValue(){
		
		return under_action;
		
	}
	
	public void Character_finder_within_String(){
		
		
		
	}
	
}

public class Reusability{
	
	public static void main(String[] args){
		
		class_for_reuseable_method_string_operations_under_dev c = new class_for_reuseable_method_string_operations_under_dev();
		
		//void cannot be deferenced 
		//System.out.println(" Repeated characters in string : " + c.reverse().under_action );
		//Created another method "PrintValue" to print the value of reverse function
		
		c.reverse();
		
		System.out.println("Repeated characters in string " + class_for_reuseable_method_string_operations_under_dev.PrintValue() + " is : " );
		
		c.Repeated_character_in_String_using_Byte('e');
	}
	
}