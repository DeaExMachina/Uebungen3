import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {

        int [][] numbers = new int[][] {{0, 1, 9},{6, 3, 2}};
        getFlatArray(numbers);

//        int [] numberArray2 = new int [] {-1, -1, -1, -1, -1, -1};
//        System.out.println(Arrays.toString(numberArray2));
//
//        int [][] numbers2 = new int [][] {{3, 5, 8}, {4, 5, 6}};
//        getFlatArray(numbers2);
//        Arrays.sort(numbers2);
//        int length = numbers2.length;
//        length = removeDuplicates(numbers2, length);
//
//        for (int i = 0; i < length; i++) {
//            System.out.println(numbers2[i] + " ");
//        }

    }
    public static int[] getFlatArray(int[][] numbers) {


        //soll in ein eindimensionales Array umgewandelt werden

        int counter = 0;
        int [] numberArray = new int[numbers[0].length * numbers.length];
                            // Anzahl der Spalten     mal    Anzahl der Zeilen, um alle Zahlen ins flat array zu bekommen



        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++){
                numberArray[counter] = numbers[i][j];
                System.out.print(numberArray[counter] + " ");
                counter++;
            }
        }
        return numberArray;
    }

    public static int removeDuplicates (int [] numbers2, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] tempA = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (numbers2[i] != numbers2[i + 1]) {
                tempA[j++] = numbers2[i];
            }
        }
        tempA[j++] = numbers2[n - 1];
        for (int i = 0; i < j; i++) {
            numbers2[i] = tempA[i];
        }
        return j;
    }
}


