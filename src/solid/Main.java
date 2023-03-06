package solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(
                circle,
                square);
        int sum = areaCalculator.sum(shapes);
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        System.out.println(printer.csv(shapes));
        System.out.println(printer.json(shapes));

    }
}
