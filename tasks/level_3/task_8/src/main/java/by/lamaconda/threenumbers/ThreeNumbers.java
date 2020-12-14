package by.lamaconda.threenumbers;

class ThreeNumbers {
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    void numbersEqualOrNot() {
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All Numbers are Equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber) {
            System.out.println("All Numbers are Different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
