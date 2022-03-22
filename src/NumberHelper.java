public class NumberHelper {
    public static int[] getFlatArray(int[][] numbers) {
        numbers = new int[][] {{0, 1, 9},{6, 3, 2}};

        //soll in ein eindimensionales Array umgewandelt werden

        int counter = 0;
        int [] numberArray = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++){
                numberArray[counter] = numbers[i][j];
                System.out.println(numberArray[counter]);
                counter++;
            }
        }
    }
}
