import java.util.Scanner;

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

    // Function to calculate the area of a circle
    public static double flaecheninhaltKreis(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Function to calculate the circumference of a circle
    public static double umfangKreis(double radius) {
        return 2 * Math.PI * radius;
    }

    // Function to calculate the diameter of a circle
    public static double durchmesserKreis(double radius) {
        return 2 * radius;
    }

    public static void main(String[] args) {
        // Circle calculations
        double radius = 5.0;
        System.out.println("Flächeninhalt des Kreises: " + flaecheninhaltKreis(radius));
        System.out.println("Umfang des Kreises: " + umfangKreis(radius));
        System.out.println("Durchmesser des Kreises: " + durchmesserKreis(radius));

        // Kite calculations
        double d1 = 5;
        double d2 = 6;
        double areaDiagonals = kiteAreaDiagonals(d1, d2);
        System.out.println("Flächeninhalt des Drachenvierecks (Diagonalen): " + areaDiagonals + " Einheiten²");

        double a = 4;
        double b = 3;
        double angleDegrees = 60;
        double areaSidesAngle = kiteAreaSidesAngle(a, b, angleDegrees);
        System.out.println("Flächeninhalt des Drachenvierecks (Seiten und Winkel): " + areaSidesAngle + " Einheiten²");

        // Rectangle calculations
        RectangleCalculator.main(args);

        // Square calculations
        SquareCalculations.main(args);
    }
}

class RectangleCalculator {
    // Function to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Function to calculate the perimeter of a rectangle
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    // Function to calculate the double area of a rectangle
    public static double calculateDoubleArea(double length, double width) {
        return 2 * calculateArea(length, width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Länge des Rechtecks ein: ");
        double length = scanner.nextDouble();
        System.out.print("Geben Sie die Breite des Rechtecks ein: ");
        double width = scanner.nextDouble();
        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);
        double doubleArea = calculateDoubleArea(length, width);
        System.out.println("Flächeninhalt: " + area);
        System.out.println("Umfang: " + perimeter);
        System.out.println("Doppelte Fläche: " + doubleArea);
        scanner.close();
    }
}

class SquareCalculations {
    // Function to calculate the perimeter of a square
    public static double calculatePerimeter(double sideLength) {
        return 4 * sideLength;
    }

    // Function to calculate the area of a square
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
