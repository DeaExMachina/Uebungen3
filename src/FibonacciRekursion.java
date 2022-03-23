import java.util.Arrays;

public class FibonacciRekursion {

    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int number3 = 0;
        int [] fibonacci = new int[15];
//        fibonacci[0] = number1;
//        fibonacci[1] = number2;
//        fibonacci[2] = number3;
//
//        System.out.println(Arrays.toString(fibonacci));

        for (int i = 1; i < fibonacci.length; i++) {
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
            fibonacci[i] = number3;

        }
        System.out.println(Arrays.toString(fibonacci));

//        number1 = number2;
//        number2 = number3;
//        number3 = number1 + number2;
//
//        fibonacci[3] = number3;
//
//        number1 = number2;
//        number2 = number3;
//        number3 = number1 + number2;
//
//        fibonacci[4] = number3;
//
//        number1 = number2;
//        number2 = number3;
//        number3 = number1 + number2;
//
//        fibonacci[5] = number3;
//
//        System.out.println(Arrays.toString(fibonacci));
    }

}