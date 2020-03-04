//Gregorian Date Class
public class GregorianDate extends Date {

    GregorianDate() {
        super(1970, 1, 1);
        long days = (System.currentTimeMillis() + java.util.TimeZone.getDefault().getRawOffset()) / 86400000;
        addDays((int)days);
    }

    public GregorianDate(int year, int month, int day) {
        super(year, month, day);
    }

    @Override
    public boolean isLeapYear(int year) {
        if (year % 400 == 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else if (year % 4 == 0)
            return true;
        else
            return false;
    }


}