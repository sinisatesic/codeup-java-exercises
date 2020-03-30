package shapes;

public class Circle {

    private double radius;
    private double pi = Math.PI;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 6;
    }

    //area
   public double getArea(){
        double area = pi * Math.pow(radius, 2);
        return Math.floor(area * 100) / 100;
   }

   public double getCircumference() {
        double area = 2 * pi * this.radius;
        return Math.floor(area * 100)/100;
   }

   //getter & setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //toString
    public String toString(){
        return "Circle[radius= " + radius + "]";
    }
}
