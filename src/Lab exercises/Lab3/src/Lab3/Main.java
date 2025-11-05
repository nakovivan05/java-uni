package Lab3;

abstract class Shape
{
    private String color;
    public Shape(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }


    public abstract double area();
    public abstract double perimeter();
    public void displayColor()
    {
        System.out.println(this.color);
    }



}
class Circle extends Shape
{
    private double radius;
    public Circle(String color, double radius)
    {
        super(color);
        this.radius=radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double area()
    {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return this.radius * Math.PI * 2;
    }
}
class Rectangle extends Shape
{
    private double width;
    private double height;
    public Rectangle(String color, double width, double height)
    {
        super(color);
        this.width = width;
        this.height = height;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }

    @Override
    public double area()
    {
        return this.width * this.height;
    }
    @Override
    public double perimeter()
    {
        return 2*(this.width + this.height);
    }

}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red",5);
        Shape s2 = new Circle("Blue",2.25);
        Shape s3 = new Rectangle("Orange",5,2);
        Shape s4 = new Rectangle("White",3,4);
        Shape[]shapes = {s1,s2,s3,s4};
        for(Shape s:shapes)
        {
            System.out.printf("Color: %s, Area: %.2f, Perimeter: %.2f%n",s.getColor(),s.area(),s.perimeter());
        }
    }
}
