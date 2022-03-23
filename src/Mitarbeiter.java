public class Mitarbeiter {

    String vorname = "Hansi";
    String nachname = "Hinterseer";
    double gehalt;
    int alter;
    double nettoGehalt;
    double jahresgehalt;

    public double monatsAbrechnung(){ //soll nacheinander durchgehen --> also zuerst 10000€ mit 20% versteuern, dann Rest mit mehr...

        gehalt = gehalt * 0.8; //wegen Sozialversicherung 20%

        if (gehalt <= 10000) {
            nettoGehalt = gehalt * 0.9;
        }
        else if (gehalt <= 20000) {
            nettoGehalt = gehalt * 0.8;
        }
        else if (gehalt <= 30000) {
            nettoGehalt = gehalt * 0.68;
        }
        else if (gehalt <= 50000) {
            nettoGehalt = gehalt * 0.55;
        }
        else {
            nettoGehalt = gehalt * 0.40;
        }
        return nettoGehalt;
    }

    public double jahresAbrechnung() {
        jahresgehalt = gehalt * 14;
        jahresgehalt = jahresgehalt * 0.8;



        return jahresgehalt;
    }



    public void main(String[] args) {
        Mitarbeiter hansi = new Mitarbeiter();
        hansi.gehalt = 2400;
        hansi.monatsAbrechnung();
        System.out.println("Hansi verdient pro Monat " + nettoGehalt + " €");

        Mitarbeiter ludwig = new Mitarbeiter();
        System.out.println(hansi.monatsAbrechnung());
    }
}
