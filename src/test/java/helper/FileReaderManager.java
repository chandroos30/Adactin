package helper;

import properties.ConfigReader;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getFrmInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigReader getCrInstance () throws Exception {
		ConfigReader cr = new ConfigReader();
		return cr;
	}

}
