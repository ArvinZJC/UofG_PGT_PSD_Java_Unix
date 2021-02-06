/*
 * @Description: a part of Problem 3
 * @Version: 1.0.1.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 22:05:54
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 22:44:18
 */

package tapp.t7.p3;

class Circle implements Figure
{
    private final int radius;

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