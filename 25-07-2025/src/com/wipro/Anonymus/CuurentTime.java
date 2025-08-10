package com.wipro.Anonymus;
import java.util.function.Consumer;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class CuurentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> tP = zone -> System.out.println("Current time in " + zone + ": " + ZonedDateTime.now(ZoneId.of(zone)).toLocalTime());
        tP.accept("Asia/Kolkata");

	}

}
