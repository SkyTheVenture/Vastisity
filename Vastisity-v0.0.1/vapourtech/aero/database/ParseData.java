package vapour.aero.database;

public class ParseData {
  
	public static Data[] getArray(Data data){
		if (data != null){
			String[] b = data.data.split(",");
			Data[] c = new Data[b.length];
			for (int i = 0; i < c.length; i++){
				c[i] = parseData(b[i]);
			}
			return c;
		}
		return new Data[0];
	}
	
	public static Data parseData(String l){
		return new Data(l.substring(0, l.indexOf("{")), l.substring(l.indexOf("{")+1, l.length()-1));
	}

}
