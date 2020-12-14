package by.lamaconda.evenorodd;

import java.util.Scanner;

class EvenOrOddDemo {
    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println("Enter your Num :");

        Scanner scanner = new Scanner(System.in);
        evenOrOdd.number = scanner.nextInt();

        evenOrOdd.oddOrEven();
    }
}
