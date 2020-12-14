package by.lamaconda.fizzbuzz;


class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1();
        fizzBuzzTest.test2();
        fizzBuzzTest.test3();
        fizzBuzzTest.test4();
    }


    public void test1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ((fizzBuzz.detect(9)).equals("Fizz")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    public void test2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ((fizzBuzz.detect(10)).equals("Buzz")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    public void test3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ((fizzBuzz.detect(15)).equals("FizzBuzz")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }

    public void test4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        if ((fizzBuzz.detect(17)).equals("17")) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}
