package by.lamaconda.leapeyear;

import by.lamaconda.leapeyear.bean.LeapYear;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.testDivFourTrue();

    }

    public void testDivFourTrue() {
        LeapYear leapYear = new LeapYear();
        boolean expected = true;
        boolean actual = leapYear.isLeapYear(2020);

        if (expected == actual) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }


}
