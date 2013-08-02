package vapour.aero.database;

public class Vastisity {
  
	public static Database loadDatabase(String file) throws Exception{
		Database db = new Database();
		db.setFile(file);
		db.refresh();
		return db;
	}

}
