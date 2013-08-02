package vapour.aero.database;

public class Vastisity {
  
	public static String version = "0.0.2";
	
	public static Database loadDatabase(String file) throws Exception{
		Database db = new Database();
		db.setFile(file);
		db.reload();
		return db;
	}

}
