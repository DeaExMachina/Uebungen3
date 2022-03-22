public class Strafe {
    String vorname = "Hansi";
    String nachname = "Hinterseer";
    String kennzeichen = "GU 145B";
    int strafnummer = 001;
    double strafe = 0d; //in Euro
    int anzahl = 0; //wie viele Strafen jemand gesammelt hat
    double verringerung; //Rabatt auf Strafen


    public void strafe(int geschwindigkeitsueberschreitung) {
        if (geschwindigkeitsueberschreitung <= 20) {
            strafe = strafe + 30;
            anzahl++;
        } else if (geschwindigkeitsueberschreitung <= 30) {
            strafe = strafe + 50;
            anzahl++;
        } else if (geschwindigkeitsueberschreitung <= 50) {
            strafe = strafe + 100;
            anzahl++;
        } else if (geschwindigkeitsueberschreitung <= 100) {
            strafe = strafe + 500;
            anzahl++;
        } else {
            strafe = strafe + 1500;
            anzahl++;
        }

    }

    public void verbandspaket() {
        strafe = strafe + 25;
        anzahl++;

    }

    public void alkohol(double wert) {
        if (wert < 0.5) {
            strafe = strafe;
            anzahl = anzahl;
        } else if (wert <= 1.0) {
            strafe = strafe + 100;
            anzahl = anzahl + 2;
        } else if (wert <= 2.0) {
            strafe = strafe + 400;
            anzahl = anzahl + 2;
        } else if (wert <= 3.0) {
            strafe = strafe + 1000;
            anzahl = anzahl + 2;
        } else {
            strafe = strafe + 5000;
            anzahl = anzahl + 2;
        }

    }

    public void sonstiges(double wert) {
        strafe = strafe + wert;
        anzahl++;

    }

    public double getStrafe() {



        if (anzahl == 1) {
            strafe = strafe * 0.7;
        } else if (anzahl == 2) {
            strafe = strafe * 0.8;
        } else if (anzahl == 3) {
            strafe = strafe * 0.9;
        }

        return strafe;
    }

    public static void main(String[] args) {

        Strafe hansi = new Strafe(); //damit man einen konkreten Menschen hat, der von den Strafen betroffen ist
        Strafe peter = new Strafe(); //ermöglicht Erstellung mehrerer Objekte

        peter.strafe(50); //100
        peter.verbandspaket(); //25
        //peter.alkohol(0.75); //100
        peter.sonstiges(50); //50
        peter.getStrafe();
        System.out.println("Der Wert der Gesamtstrafe beträgt für Peter " + peter.strafe + " €");

        hansi.strafe(100);
        hansi.getStrafe();
        System.out.println("Der Wert der Gesamtstrafe beträgt für Hansi " + hansi.strafe + " €");


    }
}





