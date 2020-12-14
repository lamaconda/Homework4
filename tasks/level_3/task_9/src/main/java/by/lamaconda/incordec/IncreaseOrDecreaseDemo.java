package by.lamaconda.incordec;

import java.util.Scanner;

class IncreaseOrDecreaseDemo {
    public static void main(String[] args) {
        IncreaseOrDecrease increaseOrDecrease = new IncreaseOrDecrease();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Number ");
        increaseOrDecrease.firstNumber = scanner.nextInt();

        System.out.println("Enter second Number ");
        increaseOrDecrease.secondNumber = scanner.nextInt();

        System.out.println("Enter third Number ");
        increaseOrDecrease.thirdNumber = scanner.nextInt();

        increaseOrDecrease.incOrDec();
    }
}
