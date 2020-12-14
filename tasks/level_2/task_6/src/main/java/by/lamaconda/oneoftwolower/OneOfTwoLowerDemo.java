package by.lamaconda.oneoftwolower;

import java.util.Scanner;

class OneOfTwoLowerDemo {
    public static void main(String[] args) {
        OneOfTwoLower oneOfTwoLower = new OneOfTwoLower();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Num");
        oneOfTwoLower.firstNum = scanner.nextInt();

        System.out.println("Enter Second Num");
        oneOfTwoLower.secondNum = scanner.nextInt();

        oneOfTwoLower.whichIsLower();
    }
}
