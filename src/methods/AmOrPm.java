package methods;

import java.util.Calendar;

public class AmOrPm {
    public static void main (String[] args){
        /*
         * Program that will determine if it is AM or PM
         * and greet the user
         */

        // Init Calendar
        Calendar cal = Calendar.getInstance();

        greeterCalendar(cal);

    }

    private static void greeterCalendar(Calendar cal) {
        /*
         * If AM : "Good Morning"
         * If PM : "I hope the morning went well for you. Enjoy the rest of your day"
         */

        int am_pm = cal.get(Calendar.AM_PM);

        if (am_pm == 0){
            //AM
            System.out.println("AM");
        }
        else{
            //PM
            System.out.println("PM");
        }
    }
}
