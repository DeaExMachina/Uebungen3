import java.util.Arrays;

public class Bahnapp {
    public static void main(String[] args) {

//        int[] stationen = new int[] {1, 2, 3, 4, 5, 6};
//        int [] minuten = new int[] {20, 16, 15, 10, 3};
//
//        // stationen [0] = minuten [0];
//
//        System.out.println(Arrays.toString(stationen));
//        System.out.println("Bei Station " + stationen [0] + " sind es noch " + minuten [0] + " Minuten.");

        System.out.println(howManyMinutes(1));
        System.out.println(howManyMinutes(3));
        System.out.println(howManyMinutes(6));


    }

    public static String howManyMinutes(int station) {
        String minutes;
        return switch (station) {
            case 1 -> minutes = "Bei Station 1 sind es noch 20 Minuten.";
            case 2 -> minutes = "Bei Station 2 sind es noch 16 Minuten.";
            case 3 -> minutes = "Bei Station 3 sind es noch 15 Minuten.";
            case 4 -> minutes = "Bei Station 4 sind es noch 10 Minuten.";
            case 5 -> minutes = "Bei Station 5 sind es noch 3 Minuten.";
            case 6 -> minutes = "Du musst jetzt aussteigen!";
            default -> minutes = null;
        };

//    public static int bisZiel (int[] station) {
//        int [] minuten;
//        int [] stationen;
//        int i;
//        int j;
//
//        for (i = 1; i <= stationen.length; i++) {
//            for (j = 1; j <= minuten.length[i]; j++) {
//
//            }
//            System.out.println("Bei Station " + station + " sind es noch " + minuten + " Minuten.");
//
//        }
//        return 0;
//
//    }

    }
}