package GoodCode;

public class calculateArea implements IShape{

    private IShape shape;

    public IShape getShape() {
        return shape;
    }

    public void setShape(IShape shape) {
        this.shape = shape;
    }

    @Override
    public void printArea() {
        shape.printArea();
    }

}
