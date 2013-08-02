package vapour.aero.database.datatypes;

public class ArrayData {
  
	Data[] data = new Data[0];
	String v;
	
	public ArrayData(String v, Data[] d){
		this.data = d;
		this.v = v;
	}
	
	public ArrayData(String v){
		this.v = v;
	}
	
	public void addData(Data a){
		Data[] b = new Data[data.length+1];
		for (int c = 0; c < data.length; c++){
			b[c] = data[c];
		}
		b[b.length-1] = a;
		data = b;
	}
	
	public void removeData(String v){
		for (Data a : data){
			if (a.v.equals(v)){
				Data[] b = new Data[data.length-1];
				int c = 0;
				for (int i = 0; i < data.length; i++){
					if (!data[i].v.equals(v)){
						b[c] = data[c];
						c++;
					}
				}
				return;
			}
		}
	}
	
	public Data getData(String var){
		for (Data a : data){
			if (a.v.equals(var)){
				return a;
			}
		}
		return null;
	}


}
