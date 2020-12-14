package by.lamaconda.leapeyear.bean;

public class LeapYear {



    public boolean isLeapYear(int year) {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isDivisionOnFour(year)) {
            return true;
        } else if (leapYear.isDivisionOnHundred(year)) {
            return true;
        } else if (leapYear.isDivisionOnFourHundred(year)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDivisionOnFour(int year) {
        if ((year % 4) == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isDivisionOnHundred(int year) {
        if ((year % 100) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDivisionOnFourHundred(int year) {
        if ((year % 400) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
