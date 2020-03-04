//Date Class
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public void addDays(int days) {
        for (int i = 0; i < days; i++) {
            if (currentDaysinYear() >= getNumberOfDaysInYear(year)) {
                year++;
                month = 1;
                day = 1;
            }
            else if (day >= getNumberOfDaysInMonth(year, month)) {
                month++;
                day = 1;
            }
            else {
                day++;
            }
        }
    }

    public void subtractDays(int days) {
        for (int i = days; i > 0; i--) {
            if (currentDaysinYear() <= 1) {
                year--;
                month = 12;
                day = 31;
            }
            else if (day <= 1) {
                month--;
                day = getNumberOfDaysInMonth(year, month);
            }
            else {
                day--;
            }
        }
    }

    private int currentDaysinYear() {
        int numDaysInYear = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDaysInYear += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numDaysInYear += 30;
                    break;
                case 2:
                    if (isLeapYear(year))
                        numDaysInYear += 29;
                    else
                        numDaysInYear += 28;
                    break;
                default:
                    break;
            }
        }
        numDaysInYear += day;
        return numDaysInYear;
    }

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


    public boolean isLeapYear() {
        return isLeapYear(year);
    }

    public void printShortDate() {
        System.out.print(month + "/" + day + "/" + year);
    }

    public void printLongDate() {
        System.out.print(getMonthName(month) + " " + day + ", " + year);
    }


    private int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            default: return 0;
        }
    }


    private int getNumberOfDaysInYear(int year) {
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }

    public String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return null;
        }
    }

    public String getMonthName() {
        return getMonthName(month);
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public int getDayOfMonth() {
        return day;
    }




}