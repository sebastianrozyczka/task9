public class ShapeCalculator {
    double squareArea(Square square){
        return Math.pow(square.getSide(), 2);
    }
    double circleArea(Circle cirle){
        return Math.PI * Math.pow(cirle.getRadius(), 2);
    }
    double trianglePerimeter(Triangle triangle){
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }
    double rectPerimeter(Rectangle rectangle){
        return rectangle.getLongerSide()*2 + rectangle.getShorterSide()*2;
    }
}
