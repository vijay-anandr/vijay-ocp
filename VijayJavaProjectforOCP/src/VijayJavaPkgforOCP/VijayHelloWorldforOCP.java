package VijayJavaPkgforOCP;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VijayHelloWorldforOCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vijay Welcome to the World of OCP");
		 LocalDateTime CurrDateTime = LocalDateTime.now();
		    System.out.println("CurrDateTime: " + CurrDateTime);
		    DateTimeFormatter CurrDateTimeFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

		    String CurrDateTimeFormatted = CurrDateTime.format(CurrDateTimeFormat);
		    System.out.println("Current Sytem Date Time Formatted: " + CurrDateTimeFormatted);
	}

}
