package generic_utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaUtility {
	public static String currentTime() {
		LocalDateTime now = LocalDateTime.now();
		return DateTimeFormatter.ofPattern("HHmmss_ddMMyyy").format(now);
	}

	public static int ggenerateRandom() {
		double random = Math.random() * 9999;
		int ranNum = (int) random;
		return ranNum;
	}

}
