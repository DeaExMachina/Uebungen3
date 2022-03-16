import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int [] firstArray = new int[] {1, 2, 3, 4, 5};
        System.out.println("Original order: " + Arrays.toString(firstArray));

        int [] orderedArray = reverse(firstArray);
        System.out.println("New Order: " + Arrays.toString(orderedArray));


    }
    public static int[] reverse (int [] firstArray) {
        int [] orderedArray = new int [firstArray.length];
        for (int number = firstArray.length -1; number >= 0; number--) {
          orderedArray[firstArray.length -1 -number] = firstArray[number];
        }
        return orderedArray;
    }
}

