package shapes;

public class Square extends Quadrilateral implements Measurable{

    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter(){
        return 4 * side;
    }

    @Override
    public void setLength(double Length) {
        this.side = length;
    }

    @Override
    public void setWidth(double width) {
        setLength(width);
    }
}
