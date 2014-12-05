
public class Codechallenge {

	/**
	 * Creating a method that will get data
	 */
	public static final String LOCALHOST_URL = "http://192.168.44.58/html/Akirachix/?";
	private static final String research_asst_name = null;
	private static final String TABLE_NAME = null;
	
	public Codechallenge(){}
	//JSON Response node names
			public static String kEY_JSON_SUCCESS = "success";
			public static String kEY_JSON_ID = "id";
			public static String kEY_JSON__research_asst_name = "Haruna Mohammed";
			public static String kEY_JSON__communities_villages= "Selinvoya";
			public static String kEY_JSON__water_manager_name= "Amadu Salifu";
			public static String kEY_JSON__Water_manager_name= "Sulemana Abdulai";
			public static String kEY_JSON__water_functioning="yes";
			
			
				public static final String DATABASE_CREATE = "create table"
						 + TABLE_NAME + "(" + kEY_JSON_ID
					     + " integer primary key autoincrement, " 
					     
						 + kEY_JSON__research_asst_name + " text,"
						 
					     + kEY_JSON__Water_manager_name +" text,"
					     
						 + kEY_JSON__communities_villages +"text,"
						 
					     + kEY_JSON__water_manager_name +" text,"
					     
					     + kEY_JSON__water_functioning +" text);";	
      public int getRowData() {
	// TODO Auto-generated method stub
	return 0;
}
}














