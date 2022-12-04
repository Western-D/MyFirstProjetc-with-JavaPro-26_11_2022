package Hometask4.GeometricArea;

public class Round implements GeometricFigureArea{
    final private double pi = 3.14;
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }
}
