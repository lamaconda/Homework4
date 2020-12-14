package by.lamaconda.oneoftwobigger;

 class OneOfTwoBigger {

        int firstNum;
        int secondNum;

        void whichIsBigger() {
            if ( firstNum > secondNum) {
                System.out.println(firstNum + " is Bigger than " + secondNum);
            } else if (secondNum > firstNum) {
                System.out.println(secondNum + " is Bigger than " + firstNum);
            } else {
                System.out.println("Equal nums");
            }
        }
}
