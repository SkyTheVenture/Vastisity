package vapour.aero.database.datatypes;


public class CharData extends Data{

  public String v;
	public char data;
	
	public CharData(String variable, Object data) {
		super(variable, data);
		this.v = variable;
		this.data = ((char)data);
	}


}
