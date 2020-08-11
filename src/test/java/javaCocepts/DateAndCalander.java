package javaCocepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class DateAndCalander {

public static void date(){
	Date d=new Date();
	
	SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	System.out.println(sdf.format(d));
	
}
@Test
public static void calendarDemo(){
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
System.out.println(sdf.format(cal.getTime()));
System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));


	
}
}
