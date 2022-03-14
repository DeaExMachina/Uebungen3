public class JustJokingAround {
    public static void main(String[] args) {
        // Soll als Ergebnis liefern, dass ich zum Vorstellungsgespräch eingeladen werde.
        // Wenn Stelle frei ist - Einladung
        // Wenn Bewerbung gut ist - Einladung
        // Wenn Bewerber sympathsch - Einladung
        // Wenn nichts davon - zumindest Anstrengung würdigen - Einladung

        isHiring(false, false, true);
        isHiring(true, false, false);
        isHiring(false, false, false);
        isHiring(false, true, false);

    }
    public static boolean isHiring (boolean isVacant, boolean isGood, boolean isLikeable) {

        if (isVacant == true) {
            System.out.println("You have a free space in your team? You could invite Julia Fliesser to a job interview.");
        }
        else if (isGood == true) {
            System.out.println("You think that this application was quite good? You could invite Julia Fliesser to a job interview.");
        }
        else if (isLikeable == true) {
            System.out.println("You think that this application is quite likeable? You could invite Julia Fliesser to a job interview.");
        }
        else {
            System.out.println("Nothing of the above? You could still honour the effort and invite Julia Fliesser to a job interview.");
        }
        return true;
    }
}
