public interface Shape {
    double getArea();
    double getPerimeter();
}

class circle implements Shape {
    double a, b, radius, pi;

    circle(double a, double b, double radius, double pi) {
        this.a = a;
        this.b = b;
        this.radius = radius;
        this.pi = pi;
    }

    public double getArea() {
        return pi * (radius * radius);
    }

    public double getPerimeter() {
        return 2 * (pi * radius);
    }
}

class Rectangle implements Shape {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }
}

class Triangle implements Shape {
    double a, b, radius, pi;

    Triangle(double a, double b, double radius, double pi) {
        this.a = a;
        this.b = b;
        this.radius = radius;
        this.pi = pi;
    }

    public double getArea() {
        return 0.5 * a * b;
    }

    public double getPerimeter() {
        // Assuming it's a right triangle where a and b are perpendicular sides:
        double hypotenuse = Math.sqrt(a * a + b * b);
        return a + b + hypotenuse;
    }
}
