package com.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	
	public static Logger Log=Logger.getLogger("Log");
	
	public static void info(String massage) {
		
		PropertyConfigurator.configure("C:\\Users\\MohammedMaheboob\\eclipse-workspace\\Slan_Mobile\\Log4j.properties.txt");
		
		Log.info(massage);
	}

}
