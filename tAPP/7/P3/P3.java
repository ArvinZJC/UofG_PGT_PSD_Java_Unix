/*
 * @Description: Problem 3
 * @Version: 1.0.0.20210203
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 22:05:54
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-03 22:44:18
 */

interface Figure
{
    // An interface's methods are all public.
    double calculatePerimeter();
    double calculateArea();
} // end interface Figure

class Circle implements Figure
{
    private int radius;

    /**
     * A circle for calculation.
     * @param radius the length of the radius
     */
    Circle(int radius)
    {
        this.radius = radius;
    } // end constructor Circle

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    } // end method calculatePerimeter

    @Override
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    } // end method calculateArea
} // end class Circle

class Triangle implements Figure
{
    private double side;

    /**
     * A triangle for calculation.
     * @param side the length of the side
     */
    Triangle(double side)
    {
        this.side = side;
    } // end constructor

    @Override
    public double calculatePerimeter()
    {
        return 3 * side;
    } // end method calculatePerimeter

    @Override
    public double calculateArea()
    {
        return (Math.sqrt(3) / 4) * side * side;
    } // end method calculateArea
} // end class Triangle

class Rectangle implements Figure
{
    private double width;
    private double height;

    /**
     * A rectangle for calculation.
     * @param width the length of the width
     * @param height the length of the height
     */
    Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    } // end constructor

    @Override
    public double calculatePerimeter()
    {
        return 2 * (width + height);
    } // end method calculatePerimeter

    @Override
    public double calculateArea()
    {
        return width * height;
    } // end method calculateArea
} // end class Rectangle

class P3
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(2);
        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println(circle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());
    } // end main
} // end class P3