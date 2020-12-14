package by.lamaconda.biggestofthree;

import java.util.Scanner;

class BiggestOfThreeDemo {
    public static void main(String[] args) {
        BiggestOfThree biggestOfThree = new BiggestOfThree();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Num");
        biggestOfThree.firstNumber = scanner.nextInt();

        System.out.println("Enter second Num");
        biggestOfThree.secondNumber = scanner.nextInt();

        System.out.println("Enter third Num");
        biggestOfThree.thirdNumber = scanner.nextInt();

        biggestOfThree.theBiggestNum();
    }
}
