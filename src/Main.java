class SquareCalculations {
    // Function to calculate the perimeter of a square
    public static double calculatePerimeter(double sideLength) {
        return 4 * sideLength;
    }

    // Function to calculate the area of a square
    public static double calculateArea(double sideLength) {
        return sideLength * sideLength;
    }
}

public class Main {
    public static double flaecheninhaltKreis(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double umfangKreis(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double durchmesserKreis(double radius) {
        return 2 * radius;
    }

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

    // Main function to demonstrate the usage of the above functions
    public static void main(String[] args) {
        // Example side length of the square
        double sideLength = 5.0;
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

        double perimeterKite = kitePerimeter(a, b);
        System.out.println("Umfang des Drachenvierecks: " + perimeterKite + " Einheiten");

        // Calculate the perimeter and area of the square
        double perimeterSquare = SquareCalculations.calculatePerimeter(sideLength);
        double areaSquare = SquareCalculations.calculateArea(sideLength);

        // Print the results for the square
        System.out.println("Side length of the square: " + sideLength);
        System.out.println("Perimeter of the square: " + perimeterSquare);
        System.out.println("Area of the square: " + areaSquare);
    }
}
