public class CalculatorTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(2);
        Triangle triangle = new Triangle(1, 2, 3);

        System.out.println(circle.calculateArea(circle));
        System.out.println(rectangle.calculatePerimeter(rectangle));
        System.out.println(square.calculateArea(square));
        System.out.println(triangle.calculatePerimeter(triangle));
    }
}
