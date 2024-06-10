// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }

    public static class RectangleCalculator {
        // Funktion zur Berechnung des Flächeninhalts eines Rechtecks
        public static double calculateArea(double length) {

            return length;
        }
        // Funktion zur Berechnung des Umfangs eines Rechtecks
        public static double calculatePerimeter(double length, double width) {

            return 2 * (length + width);
        }
        // Funktion zur Berechnung der doppelten Fläche eines Rechtecks
        public static double calculateDoubleArea(double length, double width) {

            return 2 * (length * width);
        }
        // Beispiel zur Verwendung der Funktionen
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Geben Sie die Länge des Rechtecks ein: ");
            double length = scanner.nextDouble();
            System.out.print("Geben Sie die Breite des Rechtecks ein: ");
            double width = scanner.nextDouble();
            double area = calculateArea(length);
            double perimeter = calculatePerimeter(length, width);
            double doubleArea = calculateDoubleArea(length, width);
            System.out.println("Flächeninhalt: " + area);
            System.out.println("Umfang: " + perimeter);
            System.out.println("Doppelte Fläche: " + doubleArea);
            scanner.close();
        }

    }
}