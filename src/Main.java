public class Main {
    public static void main(String[] args) {
        double radius = 5.0;

        System.out.println("Flächeninhalt des Kreises: " + flaecheninhaltKreis(radius));
        System.out.println("Umfang des Kreises: " + umfangKreis(radius));
        System.out.println("Durchmesser des Kreises: " + durchmesserKreis(radius));
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
}
