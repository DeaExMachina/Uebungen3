public class Mitarbeiter {

    String vorname = "Hansi";
    String nachname = "Hinterseer";
    double gehalt;
    int alter;
    double nettoGehalt;
    double jahresgehalt;
    double abzug;
    double nettoJahresgehalt;



    public double monatsAbrechnung() { //soll nacheinander durchgehen --> also zuerst 10000€ mit 20% versteuern, dann Rest mit mehr...

        gehalt = gehalt * 0.8; //wegen Sozialversicherung 20%

        if (gehalt <= 10000) {
            abzug = gehalt * 0.1;
        }
        if (gehalt <= 20000 && gehalt > 10000) {
            abzug = 10000 * 0.1 + (gehalt - 10000) * 0.2;
        }
        if (gehalt <= 30000 & gehalt > 20000) {
            abzug = 10000 * 0.1 + 10000 * 0.2 + (gehalt - 20000) * 0.32;
        }
        if (gehalt <= 50000 & gehalt > 30000) {
            abzug = 10000 * 0.1 + 10000 * 0.2 + 10000 * 0.32 + (gehalt - 30000) * 0.45;
        }
        if (gehalt > 50000) {
            abzug = 10000 * 0.1 + 10000 * 0.2 + 10000 * 0.32 + 10000 * 0.45 + (gehalt - 50000) * 0.6;
        }
        nettoGehalt = (gehalt - abzug) / 12;

        return nettoGehalt;
    }



    public double jahresAbrechnung() {

        jahresgehalt = jahresgehalt * 0.8;


        if (jahresgehalt <= 10000) {
            abzug = jahresgehalt * 0.1;
        }
        if (jahresgehalt <= 20000 && jahresgehalt > 10000) {
            abzug = 10000 * 0.1 + (jahresgehalt - 10000) * 0.2;
        }
        if (jahresgehalt <= 30000 & jahresgehalt > 20000) {
            abzug = 10000 * 0.1 + 10000 * 0.2 + (jahresgehalt - 20000) * 0.32;
        }
        if (jahresgehalt <= 50000 & jahresgehalt > 30000) {
            abzug = 10000 * 0.1 + 10000 * 0.2 + 10000 * 0.32 + (jahresgehalt - 30000) * 0.45;
        }
        if (jahresgehalt > 50000) {
            abzug = 10000 * 0.1 + 10000 * 0.2 + 10000 * 0.32 + 10000 * 0.45 + (jahresgehalt - 50000) * 0.6;
        }
        nettoJahresgehalt = (jahresgehalt - abzug);

        return nettoJahresgehalt;
    }


    public static void main(String[] args) {
        Mitarbeiter hansi = new Mitarbeiter();
        hansi.gehalt = 28000;
        hansi.jahresgehalt = 28000;
        System.out.println("Hansi verdient pro Monat " + hansi.monatsAbrechnung() + " €");
        System.out.println("Hansi verdient pro Jahr " + hansi.jahresAbrechnung() + " €");

        Mitarbeiter ludwig = new Mitarbeiter();
        ludwig.gehalt = 61000;
        ludwig.jahresgehalt = 61000;
        System.out.println("Ludwig verdient pro Monat " + ludwig.monatsAbrechnung() + " €");
        System.out.println("Ludwig verdient pro Jahr " + ludwig.jahresAbrechnung() + " €");
    }
}
