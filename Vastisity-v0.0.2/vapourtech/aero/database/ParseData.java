package vapour.aero.database;

import vapour.aero.database.datatypes.BooleanData;
import vapour.aero.database.datatypes.CharData;
import vapour.aero.database.datatypes.Data;
import vapour.aero.database.datatypes.IntData;
import vapour.aero.database.datatypes.StringData;

public class ParseData {
  
	public static Data[] getArray(Data data){
		if (data != null){
			String[] b = ((String) data.data).split(",");
			Data[] c = new Data[b.length];
			for (int i = 0; i < c.length; i++){
				c[i] = parseData(b[i]);
			}
			return c;
		}
		return new Data[0];
	}
	
	public static IntData parseInt(String l){
		return parseInt(parseData(l));
	}
	
	public static IntData parseInt(Data l){
		return new IntData(l.v, l.data);
	}
	
	public static BooleanData parseBoolean(String l){
		return parseBoolean(parseData(l));
	}
	
	public static BooleanData parseBoolean(Data l){
		return new BooleanData(l.v, l.data);
	}

	public static StringData parseString(String l){
		return parseString(parseData(l));
	}
	
	public static StringData parseString(Data l){
		return new StringData(l.v, l.data);
	}
	
	public static CharData parseChar(String l){
		return parseChar(parseData(l));
	}
	
	public static CharData parseChar(Data l){
		return new CharData(l.v, l.data);
	}

	public static Data parseData(String l){
		return new Data(l.substring(0, l.indexOf("{")), l.substring(l.indexOf("{")+1, l.length()-1));
	}

}
