package Hometask4.GeometricArea;

public class Square implements GeometricFigureArea {
    private double side;
    public Square(double side) {
        this.side = side;
    }



    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
