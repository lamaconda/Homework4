package by.lamaconda.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.sum(14, 5);
        calculator.subtraction(65, 32);
        calculator.multiplication(76, 3);
        calculator.dev(90, 40);
        System.out.println(calculator.isEven(8));
        System.out.println(calculator.maxOfTwoNumbers(40, 6));
        calculator.theBiggestNum(4, 5, 7);
        /*

            if you wanna see result in console
        System.out.println(calculator.sum(14,5));
        System.out.println(calculator.subtraction(65,32));
        System.out.println(calculator.multiplication(76,3));
        System.out.println(calculator.dev(90,40));

         */
    }
}
