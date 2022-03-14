import com.sun.source.tree.BreakTree;

public class ZinsDemo {
    public static void main(String[] args) {
        zinsberechnung(2000, 2.25);

    }

    public static double zinsberechnung (double kontostand, double zinsprozent) {
        double zinsen;
        zinsen = (kontostand * zinsprozent) / 100;
        System.out.println("Die Zinsen für " + kontostand + "€ betragen bei einem Zinssatz von " + zinsprozent + "% " + zinsen + "€.");
        return zinsen;
    }
}
