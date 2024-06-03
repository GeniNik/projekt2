class SquareCalculations {
    // Function to calculate the perimeter of a square
    public static double calculatePerimeter(double sideLength) {
        return 4 * sideLength;
    }

    // Function to calculate the surface (area) of a square
    public static double calculateArea(double sideLength) {
        return sideLength * sideLength;
    }

    // Main function to demonstrate the usage of the above functions
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