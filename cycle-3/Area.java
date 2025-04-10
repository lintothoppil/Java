import java.util.Scanner;
class Area{
    static double area(double radius) {
        return 3.14 * radius * radius;
    }
    static double area(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of Circle: " + area(radius));
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of Rectangle: " + area(length, width));
        scanner.close();
    }
    }

