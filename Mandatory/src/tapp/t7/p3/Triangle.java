/*
 * @Description: a part of Problem 3
 * @Version: 1.0.1.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 22:05:54
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 22:44:18
 */

package tapp.t7.p3;

class Triangle implements Figure
{
    private final double side;

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