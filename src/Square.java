public class Square {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    double calculateArea(){
        return Math.pow(side, 2);
    }
}
