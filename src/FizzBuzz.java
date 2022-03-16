public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(1);
        fizzBuzzArray(1);
    }

    public static int fizzBuzz (int number) {
        number = 1;
        while (number <= 100) {

            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println("FizzBuzz");
            }

                else if (number % 3 == 0) {
                    System.out.println("Fizz");
                }

                else if (number % 5 == 0) {
                    System.out.println("Buzz");
                }

                else {
                    System.out.println(number);
            }
                number++;
        }
        return number;
    }

    public static int [] fizzBuzzArray (int number) {
        while (number <= 100) {

            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println("FizzBuzz");
            }

            else if (number % 3 == 0) {
                System.out.println("Fizz");
            }

            else if (number % 5 == 0) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(number);
            }
            number++;
        }
        return null;

    }



}
