//Julian Date Class
public class JulianDate extends Date{
    private int day;
    private int month;
    private int year;

    JulianDate() {
        super(1, 1, 1);
        long days = (System.currentTimeMillis() + java.util.TimeZone.getDefault().getRawOffset()) / 86400000;
        addDays(719164);
        addDays((int)days);
    }

    public JulianDate(int year, int month, int day) {
        super(year, month, day);
    }

    @Override
    public boolean isLeapYear(int year) {
        if (year % 4 == 0)
            return true;
        else
            return false;
    }


}