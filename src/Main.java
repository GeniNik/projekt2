public class Main {
    // Function to calculate the area of a kite using its diagonals
    public static double kiteAreaDiagonals(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    // Function to calculate the area of a kite using its sides and the angle between them
    public static double kiteAreaSidesAngle(double a, double b, double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);
        return a * b * Math.sin(angleRadians);
    }

    // Function to calculate the perimeter of a kite
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
        // Examples for the usage of the kite functions
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

class SquareCalculations {
    // Function to calculate the perimeter of a square
    public static double calculatePerimeter(double sideLength) {
        return 4 * sideLength;
    }

    // Function to calculate the surface (area) of a square
    public static double calculateArea(double sideLength) {
        return sideLength * sideLength;
    }

    public static void main(String[] args) {
        // Example side length of the square
        double sideLength = 5.0;

        // Calculate the perimeter using the calculatePerimeter function
        double perimeter = calculatePerimeter(sideLength);

        // Calculate the area using the calculateArea function
        double area = calculateArea(sideLength);

        // Print the results
        System.out.println("Side length: " + sideLength);
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Area of the square: " + area);
    }
}
