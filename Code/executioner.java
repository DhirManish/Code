class datashata{

	public boolean tf;
	public byte bt;
	public char ch;
	public short sh;
	public int i;
	public long l;
	public float fl;
	public double db;
	public String s;
	
	public boolean data_type_boolean(){
		
		tf = true;
		
		return tf;
	
	}
	
	public byte data_type_byte(){
		
		bt = 12;
		
		return bt;
	
	}
	
	public char data_type_Char(){
		
		ch = 'a';
		
		return ch;
	
	}
	
	public short data_type_short(){
		
		sh = 12;
		
		return sh;
	
	}
	
	public int data_type_int(){
		
		i = 12345694;
		
		return i;
	
	}
	
	public long data_type_long(){
		
		l = 123434567;
		
		return l;
	
	}
	
	public float data_type_float(){
		
		fl = 1.12f;
		
		return fl;
	
	}
	
	public double data_type_double(){
		
		db = 1e1d;
		
		return db;
	
	}
	
	
	public String data_type_string(){
		
		s = "String";
		
		return s;
	
	}
	
}

public class executioner{

	public static void main(String[] args){
		
		datashata ds = new datashata();
		
		System.out.println(ds.data_type_Char());
		System.out.println(ds.data_type_boolean());
		System.out.println(ds.data_type_byte());
		System.out.println(ds.data_type_double());
		System.out.println(ds.data_type_float());
		System.out.println(ds.data_type_int());
		System.out.println(ds.data_type_short());	
		System.out.println(ds.data_type_long());
		System.out.println(ds.data_type_string());
				
	}

}