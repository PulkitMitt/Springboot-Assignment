package BadCode;

public class calculateArea {
    Square square;
    Triangle triangle;
    Rectangle rectangle;

    public calculateArea(Square square) {
        this.square = square;
    }

    public calculateArea(Triangle triangle) {
        this.triangle = triangle;
    }

    public calculateArea(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void printArea(String str){
        if(str == "triangle"){
            System.out.println(0.5 * triangle.getBase() * triangle.getHeight());
        }
        else if(str == "rectangle"){
            System.out.println(rectangle.getLength() * rectangle.getWidth());
        }
        else{
            System.out.println(square.getSide() * square.getSide());
        }
    }
}
