package by.lamaconda.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.devTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.firstGreaterThanSecondAndThirdTest();
        calculatorTest.firstGreaterThanSecondAndThirdTest();
        calculatorTest.secondGreaterThanFirstAndThirdTest();
        calculatorTest.thirdGreaterThanSecondAndFirstTest();
        calculatorTest.firstAndSecondEqualAndGreaterThanThirdTest();
        calculatorTest.firstAndThirdEqualAndGreaterThanSecondTest();
        calculatorTest.secondAndThirdEqualAndGreaterThanFirstTest();
        calculatorTest.allNumsAreEqual();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractionTest() {
        int firstNumber = 45;
        int secondNumber = 32;
        int expectedResult = 13;

        Calculator calculator2 = new Calculator();
        int actualResult = calculator2.subtraction(firstNumber, secondNumber);
        if (actualResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 76;
        int secondNumber = 3;
        int expectedResult = 228;

        Calculator calculator3 = new Calculator();
        int actualResult = calculator3.multiplication(firstNumber, secondNumber);
        if (actualResult == expectedResult) {
            System.out.println("Multi test = OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void devTest() {
        int firstNumber = 90;
        int secondNumber = 30;
        int expectedResult = 3;

        Calculator calculator4 = new Calculator();
        double actualResult = calculator4.dev(firstNumber, secondNumber);
        if (actualResult == expectedResult) {
            System.out.println("Dev test = OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void isEvenTest() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNum = 4;
        int secondNum = 2;
        int expectedResult = 4;

        Calculator calculator6 = new Calculator();
        int actualResult = calculator6.maxOfTwoNumbers(firstNum, secondNum);

        if (actualResult == expectedResult) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }

    }

    public void firstGreaterThanSecondAndThirdTest() {
        int firstNum = 10;
        int secondNum = 2;
        int thirdNum = 6;
        int expectedResult = 10;

        Calculator calculator7 = new Calculator();
        int actualResult = calculator7.theBiggestNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }

    }

    public void secondGreaterThanFirstAndThirdTest() {
        int firstNum = 10;
        int secondNum = 27;
        int thirdNum = 9;
        int expectedResult = 27;

        Calculator calculator7 = new Calculator();
        int actualResult = calculator7.theBiggestNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }

    }

    public void thirdGreaterThanSecondAndFirstTest() {
        int firstNum = 16;
        int secondNum = 5;
        int thirdNum = 50;
        int expectedResult = 50;

        Calculator calculator7 = new Calculator();
        int actualResult = calculator7.theBiggestNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }

    }

    public void firstAndSecondEqualAndGreaterThanThirdTest() {
        int firstNum = 13;
        int secondNum = 13;
        int thirdNum = 12;
        int expectedResult = 13;

        Calculator calculator7 = new Calculator();
        int actualResult = calculator7.theBiggestNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }

    }

    public void firstAndThirdEqualAndGreaterThanSecondTest() {
        int firstNum = 17;
        int secondNum = 13;
        int thirdNum = 17;
        int expectedResult = 17;

        Calculator calculator7 = new Calculator();
        int actualResult = calculator7.theBiggestNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }

    }

    public void secondAndThirdEqualAndGreaterThanFirstTest() {
        int firstNum = 8;
        int secondNum = 19;
        int thirdNum = 19;
        int expectedResult = 19;

        Calculator calculator7 = new Calculator();
        int actualResult = calculator7.theBiggestNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }

    }

    public void allNumsAreEqual() {
        int firstNum = 23;
        int secondNum = 23;
        int thirdNum = 23;
        int expectedResult = 23;

        Calculator calculator7 = new Calculator();
        int actualResult = calculator7.theBiggestNum(firstNum, secondNum, thirdNum);

        if (actualResult == expectedResult) {
            System.out.println("Success");
        } else {
            System.out.println("FAIL");
        }

    }
}

