public class Rectangle {
    private double shorterSide;
    private double longerSide;

    public void setShorterSide(double shorterSide) {
        this.shorterSide = shorterSide;
    }

    public void setLongerSide(double longerSide) {
        this.longerSide = longerSide;
    }

    public Rectangle(double shorterSide, double longerSide) {
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
    }

    double calculatePerimeter(){
        return longerSide*2 + shorterSide*2;
    }
}
