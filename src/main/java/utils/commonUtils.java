package utils;

import java.util.Date;

public class commonUtils {
	
	public static final int IMPLICIT_WAIT_TIME = 10;
	public static final int PAGE_LOAD_TIME =10;
	public static final int EXPLICT_WAIT_BASIC_TIME=30;
	public static String getEmailWithTimeStramp() {
		Date date = new Date();
		return "Sony213"+date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
	}


}
