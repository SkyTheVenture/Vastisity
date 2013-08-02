package vapour.aero.database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Database {

  Data[] data = new Data[0];
	String datas = "";
	String file = null;
	
	public static String version = "0.0.1 (V1)";
	
	public void setFile(String file){
		this.file = file;
	}
	
	public void setFile(File file){
		this.file = file.getAbsolutePath();
	}

	public Data getData(String a){
		for (Data b : data){
			if (b.v.equals(a)){
				return b;
			}
		}
		return null;
	}

	public String saveFormat(){
		datas = "#" + version + "\n";
		for (Data a : data){
			datas = datas + a.v + "{" + a.data + "}\n";
		}
		return datas;
	}
	
	public void refresh() throws Exception {
		if (!new File(file).exists()){
			new File(file).createNewFile();
		}
		BufferedReader br = new BufferedReader(new FileReader(new File(file)));
		String line;
		while ((line = br.readLine()) != null){
			if (!line.startsWith("#")){
				Data a = ParseData.parseData(line);
				this.replaceData(a.v, a.data);
			}
		}
		br.close();
	}

	public void save() throws Exception{
		File file = new File(this.file);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(saveFormat());
		bw.close();
	}

	public boolean addData(String a, String b){
		return addData(new Data(a,b));
	}
	
	public boolean addData(Data a){
		if (getData(a.v) == null){
			Data[] newData = new Data[data.length+1];
			for (int i = 0; i < data.length; i++){
				newData[i] = data[i];
			}
			newData[newData.length-1] = a;
			data = newData;
			return true;
		} else {
			return false;
		}
	}
	
	public void replaceData(Data a){
		if (getData(a.v) == null){
			addData(a);
		} else {
			getData(a.v).data = a.data;
		}
	}

	public void replaceData(String a, String b){
		replaceData(new Data(a,b));
	}
}
