package by.lamaconda.incordec;

class IncreaseOrDecrease {
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    void incOrDec() {
        if (secondNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
