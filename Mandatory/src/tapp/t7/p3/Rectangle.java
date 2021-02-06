/*
 * @Description: a part of Problem 3
 * @Version: 1.0.1.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 22:05:54
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 22:44:18
 */

package tapp.t7.p3;

class Rectangle implements Figure
{
    private final double width;
    private final double height;

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