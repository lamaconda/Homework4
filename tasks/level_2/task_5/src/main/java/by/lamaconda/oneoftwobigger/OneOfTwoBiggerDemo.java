package by.lamaconda.oneoftwobigger;

import java.util.Scanner;

 class OneOfTwoBiggerDemo {
    public static void main(String[] args) {
        OneOfTwoBigger oneOfTwoBigger = new OneOfTwoBigger();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Num");
        oneOfTwoBigger.firstNum = scanner.nextInt();

        System.out.println("Enter Second Num");
        oneOfTwoBigger.secondNum = scanner.nextInt();

        oneOfTwoBigger.whichIsBigger();
    }
}
