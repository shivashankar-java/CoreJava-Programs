package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class DateTime {
// 
//	
//	
//	
//	
//	
   public static void main(String[] args) {
	
	   LocalDate date = LocalDate.now();
	   System.out.println("The Date is :" + date);
	   
	   LocalDate date1 = LocalDate.of(2001, Month.FEBRUARY, 22);
	   System.out.println(date1);
	   
	   LocalTime time=LocalTime.now();
	   System.out.println("The Time is :"+ time);
	   
	   LocalTime time1=LocalTime.of(2, 45, 48, 566);
	   System.out.println(time1);
	   
	   LocalDateTime Td= LocalDateTime.now();
	   System.out.println(Td);
	   
	   ZonedDateTime Zd =ZonedDateTime.now();
	   System.out.println(Zd);
    }
}
