package by.lamaconda.biggestofthree;


// 1 2 3
// 1 3 2
// 3 2 1
// 3 3 3

class BiggestOfThree {
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    void theBiggestNum() {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " Is Biggest");

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + " Is Biggest");

        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println(thirdNumber + " Is Biggest");

        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " Is Biggest");

        } else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
            System.out.println(firstNumber + " Is Biggest");

        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            System.out.println(secondNumber + " Is Biggest");

        } else {
            System.out.println("Equal");
        }

    }

}
