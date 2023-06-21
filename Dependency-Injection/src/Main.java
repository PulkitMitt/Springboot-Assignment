import BadCode.Rectangle;
import BadCode.Square;
import BadCode.Triangle;
import BadCode.calculateArea;

public class Main {
    public static void main(String[] args) {

//        Bad code example given below
        Square sq = new Square(5);
        calculateArea ca = new calculateArea(sq);
        ca.printArea("square");

        Rectangle rec = new Rectangle(5, 10);
        ca = new calculateArea(rec);
        ca.printArea("rectangle");

        Triangle tri = new Triangle(10,20);
        ca = new calculateArea(tri);
        ca.printArea("triangle");

//        Good code below
        GoodCode.Rectangle rectangle = new GoodCode.Rectangle(10,20);
        rectangle.printArea();

        GoodCode.Square square = new GoodCode.Square(10);
        square.printArea();

        GoodCode.Triangle triangle = new GoodCode.Triangle(20, 40);
        triangle.printArea();
    }
}