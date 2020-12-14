package by.lamaconda.oneoftwolower;

public class OneOfTwoLower {

    int firstNum;
    int secondNum;

    void whichIsLower() {
        if (firstNum > secondNum) {
            System.out.println(secondNum + " is Lower than " + firstNum);
        } else if (secondNum > firstNum) {
            System.out.println(firstNum + " is Lower than " + secondNum);
        } else {
            System.out.println("Equal nums");
        }
    }
}
