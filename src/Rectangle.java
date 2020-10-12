public class Rectangle {
    private double shorterSide;
    private double longerSide;

    public double getShorterSide() {
        return shorterSide;
    }

    public void setShorterSide(double shorterSide) {
        this.shorterSide = shorterSide;
    }

    public double getLongerSide() {
        return longerSide;
    }

    public void setLongerSide(double longerSide) {
        this.longerSide = longerSide;
    }

    public Rectangle(double shorterSide, double longerSide) {
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
    }
}
