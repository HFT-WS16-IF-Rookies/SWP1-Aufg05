/**
 * @author Lukas Wiest
 */
package calendar;

import java.util.Calendar;
import java.util.Date;

public class Holidays
{

    public static enum DAY_CLASS
    {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY,
        NEWYEAR,
        HOLY_THREE_KINGS,
        GOOD_FRIDAY,
        EASTER_SUNDAY,
        EASTER_MONDAY,
        CHRIST_ASCESION,
        PENTECOST_SUNDAY,
        PENTECOST_MONDAY,
        CORPUS_CHRISTI,
        LABOUR_DAY,
        ASSUMPTION_DAY,
        UNIFICATION_DAY,
        REFORMATION_DAY,
        ALL_SAINTS_DAY,
        PRAYER_REPENTANCE,
        CHRISTMAS_EVE,
        CHRISTMAS_1ST,
        CHRISTMAS_2ND,
        NEWYEARS_EVE
    }

    public static Holidays.DAY_CLASS classifyWeekday(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        switch(cal.get(Calendar.DAY_OF_WEEK))
        {
            case Calendar.MONDAY:
                return Holidays.DAY_CLASS.MONDAY;
            case Calendar.TUESDAY:
                return Holidays.DAY_CLASS.TUESDAY;
            case Calendar.WEDNESDAY:
                return Holidays.DAY_CLASS.WEDNESDAY;
            case Calendar.THURSDAY:
                return Holidays.DAY_CLASS.THURSDAY;
            case Calendar.FRIDAY:
                return Holidays.DAY_CLASS.FRIDAY;
            case Calendar.SATURDAY:
                return Holidays.DAY_CLASS.SATURDAY;
            default:
                return Holidays.DAY_CLASS.SUNDAY;
        }
    }

    public static Holidays.DAY_CLASS classifyHoliday(Date date)
    {
        // Roughly 42 lines of implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }

    static int easterSunday(int X)
    {
        // Roughly 9 lines of implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
