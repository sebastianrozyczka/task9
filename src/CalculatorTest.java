public class CalculatorTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 3);
        Square square = new Square(2);
        Triangle triangle = new Triangle(1, 2, 3);
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println(shapeCalculator.circleArea(circle));
        System.out.println(shapeCalculator.rectPerimeter(rectangle));
        System.out.println(shapeCalculator.squareArea(square));
        System.out.println(shapeCalculator.trianglePerimeter(triangle));
    }
}
