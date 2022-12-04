package Hometask4.GeometricArea;

public class Triangle implements GeometricFigureArea{
    double apexA;
    double apexB;
    double apexC;

    public Triangle(double apexA, double apexB, double apexC) {
        this.apexA = apexA;
        this.apexB = apexB;
        this.apexC = apexC;
    }

    public void setApexA(double apexA) {
        this.apexA = apexA;
    }

    public void setApexB(double apexB) {
        this.apexB = apexB;
    }

    public void setApexC(double apexC) {
        this.apexC = apexC;
    }

    public double getApexA() {
        return apexA;
    }

    public double getApexB() {
        return apexB;
    }

    public double getApexC() {
        return apexC;
    }

    @Override
    public double getArea() {
        double perimeter = getPerimeter();
        double л = perimeter * (perimeter - apexA) * (perimeter - apexB) * (perimeter - apexC);
        return Math.sqrt(л);
    }

    public double getPerimeter() {
        return (apexA + apexB + apexC)/2;
    }
}
