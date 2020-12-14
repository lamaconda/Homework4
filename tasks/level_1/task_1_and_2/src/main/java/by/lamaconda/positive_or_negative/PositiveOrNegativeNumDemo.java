package by.lamaconda.positive_or_negative;

import java.util.Scanner;

class PositiveOrNegativeNumDemo {
    public static void main(String[] args) {
        PositiveOrNegativeNum version1 = new PositiveOrNegativeNum();
        System.out.println("Please enter your number!");
        Scanner scanner = new Scanner(System.in);
        version1.userNum = scanner.nextInt();

        version1.positiveOrNegative();


    }
}
