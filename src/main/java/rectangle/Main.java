package rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину прямоугольника: ");
        double side1 = Double.parseDouble(reader.readLine());
        System.out.println("Введите ширину прямоугольника: ");
        double side2 = Double.parseDouble(reader.readLine());

        double rectangleArea;
        Rectangle areaRectangle = new Rectangle();
        rectangleArea = areaRectangle.areaCalculator(side1, side2);
        System.out.println("Площадь прямоугольника = " + rectangleArea);

        double rectanglePermiter;
        Rectangle perimRectangle = new Rectangle();
        rectanglePermiter = perimRectangle.perimeterCalculator(side1, side2);
        System.out.println("Площадь прямоугольника = " + rectanglePermiter);
    }
}
