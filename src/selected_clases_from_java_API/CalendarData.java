package lets_get_certified.selected_clases_from_java_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalendarData {
    public static void main(String[] args) {
        customFormats();
//        LocalDate nowDate = LocalDate.now();
//        LocalTime nowTime = LocalTime.now();
//        LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);// one way
//        
//        // Output:  It is now 2021-06-23T16:59:12.464384100 here.
//        System.out.println("It is now "+nowDateTime+ " here.");   
//
//        LocalDateTime nowDateTime2 = LocalDateTime.now();   // another way
//        // Output:  It is now 2021-06-23T16:59:12.482183600 here.
//        System.out.println("It is now "+nowDateTime2+ " here.");   
//        
//        // Setting St. Patricks Day, 2022
//        LocalDate stPatricksDay1 = LocalDate.of(2022, 3, 17);// one way
//        LocalDate stPatricksDay2 = LocalDate.parse("2022-03-17");// another way
//        // Output:  St. Patricks Day 2022-03-17; 2022-03-17
//        System.out.println("St. Patricks Day "+stPatricksDay1+ "; "+stPatricksDay2);   
//        
//        LocalTime lectureBegins = LocalTime.of(9, 0);
//        LocalTime lectureEnds   = LocalTime.parse("11:00");
//        // Output:  Lecture begins at 09:00 and ends at 11:00
//        System.out.println("Lecture begins at "+lectureBegins+ " and ends at "+lectureEnds);
    }   
    public static void period(){
        LocalDate christmasDay  = LocalDate.of(2021, 12, 25);
        Period prepTime         = Period.ofWeeks(4);
        LocalDate reminder      = christmasDay.minus(prepTime);
        // P = Period, D = days
        System.out.println("Period = "+prepTime);  // Period = P28D
        System.out.println("Reminder = "+reminder);// Reminder = 2021-11-27
    }
    
    public static void customFormats(){
        // Date
        LocalDate date = LocalDate.of(2022, Month.AUGUST, 10);
        System.out.println(date);// 2022-08-10
    //  DateTimeFormatter format = 
    //      DateTimeFormatter.ofPattern("yyyy-MMM-dd");// 2022-Aug-10
    //  DateTimeFormatter format = 
    //      DateTimeFormatter.ofPattern("yyyy-MM-dd E D");// 2022-08-10 Wed 222
    //    DateTimeFormatter format = // needed 4 E's to get full day i.e. Wednesday
    //        DateTimeFormatter.ofPattern("yy-MMM-dd EEEE d");// 22-Aug-10 Wednesday 10
    //    System.out.println(date.format(format));

        // Time
        LocalTime time = LocalTime.of(14, 40);
        System.out.println(time);// 14:40
        //        DateTimeFormatter format = 
        //            DateTimeFormatter.ofPattern("hh:mm:ss");// 02:40:00
        //        DateTimeFormatter format = 
        //            DateTimeFormatter.ofPattern("HH:mm");// 14:40
        
        // DateTimeFormatter format = // IllegalArgumentException: Unknown pattern letter: P
        //     DateTimeFormatter.ofPattern("Phone call at h:mm a");
        DateTimeFormatter format = // Phone call at 2:40 pm
            DateTimeFormatter.ofPattern("'Phone call at' h:mm a");
        

        System.out.println(time.format(format));


    }
    
    public static void dtf(){
        // Creating a date and time in a string and then telling LocalDateTime
        // how to parse the string using a DateTimeFormatter
        String stPatricksDayTimeStr = "2022-03-17 20:13";
        DateTimeFormatter formatter = // MM = month; HH = hours in 24hr clock; mm = minutes
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime stPatricksDayTime = LocalDateTime.parse(stPatricksDayTimeStr, formatter);
        // Output:  St. Patricks Day: 2022-03-17T20:13
        System.out.println("St. Patricks Day: "+stPatricksDayTime);
    }
}
