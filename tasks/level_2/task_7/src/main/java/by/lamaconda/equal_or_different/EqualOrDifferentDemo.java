package by.lamaconda.equal_or_different;

import java.util.Scanner;

class EqualOrDifferentDemo {
    public static void main(String[] args) {
        EqualOrDifferent isNumsEqual = new EqualOrDifferent();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Num");
        isNumsEqual.firstNum = scanner.nextInt();

        System.out.println("Enter Second Num");
        isNumsEqual.secondNum = scanner.nextInt();

        isNumsEqual.equalOrNot();
    }
}
