/*
 * @Description: a part of Problem 3
 * @Version: 1.0.1.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 22:05:54
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 22:44:18
 */

package tapp.t7.p3;

class Main
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
} // end class Main