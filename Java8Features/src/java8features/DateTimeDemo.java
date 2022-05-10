package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) {
		// Legacy class to deal with date & Time which is now deprecated
        Date d1=new Date();
        System.out.println(d1);
        System.out.println(d1.getDate());
        System.out.println(d1.getHours() +" : "+d1.getMinutes()+":"+d1.getSeconds());
       
        // Calendar Class
        Calendar cal=Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println("********** Java 8 Date & Time Classes ************");
        
        LocalDate d=LocalDate.now();
        LocalTime t=LocalTime.now();
        LocalDateTime dt=LocalDateTime.now();
       
        System.out.println("Date & Time is : "+d + " -->"+ t );
        System.out.println("Before Formatting :"+dt);
	}

}
