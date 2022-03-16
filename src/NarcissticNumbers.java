public class NarcissticNumbers {
    public static void main(String[] args) {
        for (int num = 1; num <= 1000; num++) {
            int number, digit, sum = 0;
            number = num;

            while (number != 0) {
                digit = number % 10;
                sum = sum + digit * digit * digit;
                number /= 10;
            }

            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            }
//            else {
//                System.out.println(num + " is not an Armstrong number.");
//            }
        }
    }
}
