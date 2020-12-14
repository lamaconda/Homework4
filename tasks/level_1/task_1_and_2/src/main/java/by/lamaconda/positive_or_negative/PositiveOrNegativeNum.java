package by.lamaconda.positive_or_negative;

class PositiveOrNegativeNum {

    int userNum;

    public void positiveOrNegative() {
        if (userNum > 0) {
            System.out.println("Your number is Positive");
        } else if (userNum < 0) {
            System.out.println("Your number is Negative");
        } else {
            System.out.println("Zero is Zero");
        }

    }
}
