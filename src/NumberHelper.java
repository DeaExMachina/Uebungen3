

public class NumberHelper {
    public static void main(String[] args) {

        int [][] numbers = new int[][] {{0, 1, 9},{6, 3, 2}};
        getFlatArray(numbers);
    }
    public static int[] getFlatArray(int[][] numbers) {


        //soll in ein eindimensionales Array umgewandelt werden

        int counter = 0;
        int [] numberArray = new int[numbers[0].length * numbers.length];
                            // Anzahl der Spalten     mal    Anzahl der Zeilen, um alle Zahlen ins flat array zu bekommen

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++){
                numberArray[counter] = numbers[i][j];
                System.out.println(numberArray[counter]);
                counter++;
            }
        }
        return numberArray;
    }
}


