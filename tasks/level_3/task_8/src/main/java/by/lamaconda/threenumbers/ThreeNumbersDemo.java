package by.lamaconda.threenumbers;

import java.util.Scanner;

class ThreeNumbersDemo {
    public static void main(String[] args) {
        ThreeNumbers threeNumbers = new ThreeNumbers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first Number ");
        threeNumbers.firstNumber = scanner.nextInt();

        System.out.println("Please enter second Number ");
        threeNumbers.secondNumber = scanner.nextInt();

        System.out.println("Please enter third Number ");
        threeNumbers.thirdNumber = scanner.nextInt();

        threeNumbers.numbersEqualOrNot();
    }
}
