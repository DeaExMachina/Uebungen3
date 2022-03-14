public class Bahnapp {
    public static void main(String[] args) {
        bisZiel(1);


    }

    public static int bisZiel (int station) {
        int minuten = 20;
        int zeit;

        while (station <= 5) {
            System.out.println("Bei Station " + station + " sind es noch " + minuten + " Minuten.");
            zeit = minuten - 4;
            System.out.println("Bei Station " + station + " sind es noch " + minuten + " Minuten.");
            zeit = minuten - 1;
            System.out.println("Bei Station " + station + " sind es noch " + minuten + " Minuten.");
            zeit = minuten - 5;
            System.out.println("Bei Station " + station + " sind es noch " + minuten + " Minuten.");
            zeit = minuten -7;
        }
        return zeit;

    }
}
