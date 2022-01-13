package Date_Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task_1 {
    public static void main(String[] args) throws ParseException {
        String thatDay = "17/05/1995 02:45:00 PM";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date dateofbirth = format.parse(thatDay);
        Date today = new Date();
        long d = today.getTime() - dateofbirth.getTime();
        long year = d / (1000l * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;
        System.out.println("My Date of Birth is 17th May 1995.");
        System.out.println("Right now my age is :");
        System.out.print(year+" Years, ");
        System.out.print(day+" Days, ");
        System.out.print(hour+" Hours, ");
        System.out.print(minutes+" Minutes, ");
        System.out.print(second+" Seconds. ");
    }
}
