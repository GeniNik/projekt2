public class Main {

    // Funktion zur Berechnung des Flächeninhalts eines Drachenvierecks anhand der Diagonalen
    public static double kiteAreaDiagonals(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    // Funktion zur Berechnung des Flächeninhalts eines Drachenvierecks anhand der Seitenlängen und des Winkels
    public static double kiteAreaSidesAngle(double a, double b, double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);
        return a * b * Math.sin(angleRadians);
    }

    // Funktion zur Berechnung des Umfangs eines Drachenvierecks
    public static double kitePerimeter(double a, double b) {
        return 2 * (a + b);
    }

    public static double flaecheninhaltKreis(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double umfangKreis(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double durchmesserKreis(double radius) {
        return 2 * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;

        System.out.println("Flächeninhalt des Kreises: " + flaecheninhaltKreis(radius));
        System.out.println("Umfang des Kreises: " + umfangKreis(radius));
        System.out.println("Durchmesser des Kreises: " + durchmesserKreis(radius));

        // Beispiele für die Nutzung der Funktionen
        double d1 = 5;
        double d2 = 6;
        double areaDiagonals = kiteAreaDiagonals(d1, d2);
        System.out.println("Flächeninhalt des Drachenvierecks (Diagonalen): " + areaDiagonals + " Einheiten²");

        double a = 4;
        double b = 3;
        double angleDegrees = 60;
        double areaSidesAngle = kiteAreaSidesAngle(a, b, angleDegrees);
        System.out.println("Flächeninhalt des Drachenvierecks (Seiten und Winkel): " + areaSidesAngle + " Einheiten²");

        double perimeter = kitePerimeter(a, b);
        System.out.println("Umfang des Drachenvierecks: " + perimeter + " Einheiten");
    }
}
