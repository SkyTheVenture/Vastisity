package vapour.aero.database.datatypes;


public class BooleanData extends Data{

  public String v;
	public boolean data;
	
	public BooleanData(String variable, Object data) {
		super(variable, data);
		this.v = variable;
		this.data = (((String) data).equalsIgnoreCase("true") ? true : false);
	}


}
