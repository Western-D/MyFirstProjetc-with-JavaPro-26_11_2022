package Hometask4.GeometricArea;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<GeometricFigureArea> geometricFigureList = new ArrayList<>();
        geometricFigureList.add(new Round(10));
        geometricFigureList.add(new Triangle(6,8,10));
        geometricFigureList.add(new Square(10));
        sumOfArea(geometricFigureList);
    }
    public static void sumOfArea(ArrayList<GeometricFigureArea> list)
    {
        double sum = 0;
        for (GeometricFigureArea figure : list) {
            sum+=figure.getArea();
        }
        System.out.println(sum);
    }
}
