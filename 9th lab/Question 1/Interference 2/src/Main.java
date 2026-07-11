public class Main {
    public static void main(String[] args) {
        // circle(double a, double b, double radius, double pi)
        circle c = new circle(0, 0, 7, 3.1416);

        // Triangle(double a, double b, double radius, double pi)
        Triangle t = new Triangle(3, 4, 0, 0);

        // Rectangle(double a, double b)
        Rectangle r = new Rectangle(5, 10);

        // Output for circle
        System.out.println("Circle Area: " + c.getArea());
        System.out.println("Circle Perimeter: " + c.getPerimeter());

        // Output for triangle
        System.out.println("Triangle Area: " + t.getArea());
        System.out.println("Triangle Perimeter: " + t.getPerimeter());

        // Output for rectangle
        System.out.println("Rectangle Area: " + r.getArea());
        System.out.println("Rectangle Perimeter: " + r.getPerimeter());
    }
}



