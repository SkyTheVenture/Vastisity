package vapour.aero.database.datatypes;


public class IntData extends Data {

  public String v;
	public int a;
	
	public IntData(String variable, Object data) {
		super(variable, data);
		v = variable;
		a = Integer.parseInt(data.toString());
	}

}
