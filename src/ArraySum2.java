public class ArraySum2 {
    public static void main(String[] args) {
        int [] numbers = new int[] {1, 2, 3, 4, 30};

        System.out.println("The sum of the numbers in the array is: " + calculateSum(numbers));


    }
    public static int calculateSum (int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

}

