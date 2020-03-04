package filehandling;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class time {
public static void main (String[]args)
{
	LocalDate date=LocalDate.now();
	System.out.println("Default format of Local Date");
	System.out.println("Pattern"+date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
	LocalTime lt=LocalTime.now();
	System.out.println("Time"+lt);
	LocalDateTime dateTime=LocalDateTime.now();
	System.out.println("Default format of local date and time= "+dateTime);
	System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
	System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
}
}
