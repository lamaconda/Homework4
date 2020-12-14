package by.lamaconda.calculator;

class Calculator {


    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double dev(int firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber)
    {
        return Math.max(firstNumber, secondNumber);
    }

    public int theBiggestNum(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            return firstNumber & secondNumber;
        } else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
            return firstNumber & thirdNumber;

        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            return secondNumber & thirdNumber;
        } else {
            return secondNumber & firstNumber & thirdNumber;
        }

    }


}

