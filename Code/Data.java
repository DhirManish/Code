class DataTypes {

	private String var = "to fetch the value of private variable";
	
	public String override_variable_access(){

		String public_var =  var;
		
		return public_var;
	
	}

}

public class Data{
	
	public static void main(String[] args){
	
		DataTypes DT = new DataTypes();
	
		System.out.println(DT.override_variable_access());
	
	}
	
}