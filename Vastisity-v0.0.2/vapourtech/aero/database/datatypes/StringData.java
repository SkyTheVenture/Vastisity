package vapour.aero.database.datatypes;


public class StringData extends Data {

  public String v;
	public String data;
	
	public StringData(String variable, Object data) {
		super(variable, data);
		v = variable;
		this.data = (String)data;
	}

}
