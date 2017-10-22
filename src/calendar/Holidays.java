/**
 * Created by Classdumper, User Peter Heusch
 * Creation Date: 21.10.2017 10:05:26
 */
package calendar;

import de.hft_stuttgart.unittest.loader.Skeleton;
import java.util.Date;

@Skeleton
public class Holidays
{

    static
    {
        System.err.println("Please call injectClass(\"calendar.Holidays\"), you've imported a skeleton");
    }

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

    public Holidays()
    {
        // Roughly 1 lines of implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static Holidays.DAY_CLASS classifyWeekday(Date date)
    {
        // Roughly 9 lines of implementation
        throw new UnsupportedOperationException("Not yet implemented");
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
