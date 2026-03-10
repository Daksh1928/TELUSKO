package EnumAnnotations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LaunchDateTime {
	public static void main(String[] args) {
		// util, sql Date DateTime deprecated
		// joda api ==> time api ==> time package

		// Date dateTime = new Date();
		// System.out.println(dateTime);
		// int time = dateTime.getMinutes();
		// System.out.println(time);
		// int hour = dateTime.getHours();
		// System.out.println(hour);

		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalDate dob = LocalDate.of(1994, 03, 8);
		System.out.println(dob);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		int dayOfYear = dateTime.getDayOfYear();
		System.out.println(dayOfYear);
		int hour = dateTime.getHour();
		int min = dateTime.getMinute();
		int sec = dateTime.getSecond();
		int nano = dateTime.getNano();
		System.out.println(hour + " : " + min + " : " + sec + " : " + nano);

	}

}
