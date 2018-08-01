import java.lang.reflect.Field;

class var{
	
	public boolean tf;
	public byte bt;
	public char ch;
	public short sh;
	public int i;
	public long l;
	public float fl;
	public double db;
	public String s;
	
	//void vartype(Object obj){
		
		//System.out.println(type(obj));
				
	//}

}

public class Variable{

	public static void main(String[] args){
		
		var v;
		
		Field[] fields = var.class.getDeclaredFields();
        for(Field f : fields){
            Class t = f.getType();
            System.out.println("field name : " + f.getName() + " , type : " + t);
        }
		
	}

}