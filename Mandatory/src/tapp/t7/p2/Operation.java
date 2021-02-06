/*
 * @Description: a part of Problem 2
 * @Version: 1.0.3.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-01 10:48:01
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 11:07:21
 */

package tapp.t7.p2;

enum Operation
{
    PLUS, MINUS, TIMES, DIVIDE;

    /**
     * Perform a basic arithmetic operation.
     * @param num1 a number
     * @param num2 another number
     * @return the calculation result
     */
    double calculate(@SuppressWarnings("SameParameterValue") double num1, @SuppressWarnings("SameParameterValue") double num2)
    {
        return switch (this) {
            case PLUS -> num1 + num2;
            case MINUS -> num1 - num2;
            case TIMES -> num1 * num2;
            case DIVIDE -> num1 / num2;
        };
    } // end method calculate
} // end enum Operation