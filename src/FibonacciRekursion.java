import java.util.Arrays;

public class FibonacciRekursion {

    public static void main(String[] args) {
//        int number1 = 0;
//        int number2 = 1;
//        int number3 = 0;
//        int [] fibonacci = new int[15];
//
//        int i = 1;
//        if (i < fibonacci.length) {
//            number1 = number2;
//            number2 = number3;
//            number3 = number1 + number2;
//            fibonacci[i] = number3;
//        fibonacci[0] = number1;
//        fibonacci[1] = number2;
//        fibonacci[2] = number3;
//
//        System.out.println(Arrays.toString(fibonacci));

//        for (int i = 1; i < fibonacci.length; i++) {
//            number1 = number2;
//            number2 = number3;
//            number3 = number1 + number2;
//            fibonacci[i] = number3;
//        }
        //System.out.println(Arrays.toString(fibonacci))

        System.out.println(fibonacciZahlen(10));


    }

    public static int fibonacciZahlen(int n) {

        if (n <= 1) {
            return 1;
        } else return fibonacciZahlen(n - 2) + fibonacciZahlen(n - 1);


//    public static int fibonacciZahlen(int i) {
//        int number1 = 0;
//        int number2 = 1;
//        int number3 = 0;
//        int[] fibonacci = new int[15];
//
//        i = 1;
//
//        if (i == 0) {
//            return 0;
//        }
//            else {
//
//            number1 = number2;
//            number2 = number3;
//            number3 = number1 + number2;
//            fibonacci[i] = number3;
//            i++;
//
//            System.out.println(Arrays.toString(fibonacci));
//
//
//            return number3;
//        }
//
//    }
    }
}