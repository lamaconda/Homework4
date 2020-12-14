package by.lamaconda.daysofweek;

import java.util.Scanner;

class DaysOfWeekDemo {
    public static void main(String[] args) {
        DaysOfWeek whatDay = new DaysOfWeek();
        System.out.println("Please enter your Number from 1 to 7");
        System.out.println("and I tell you what day of the week it is :");
        Scanner scanner = new Scanner(System.in);
        whatDay.number = scanner.nextInt();

        whatDay.daysOfWeek();
    }
}
