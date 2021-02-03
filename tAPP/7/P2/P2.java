/*
 * @Description: Problem 2
 * @Version: 1.0.1.20210203
 * @Author: Arvin Zhao
 * @Date: 2021-02-01 10:48:01
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-03 22:03:55
 */

enum Operation
{
    PLUS, MINUS, TIMES, DIVIDE;

    /**
     * Perform a basic arithmetic operation.
     * @param num1 a number
     * @param num2 another number
     * @return the calculation result
     */
    double calculate(double num1, double num2)
    {
        switch (this)
        {
            case PLUS:
                return num1 + num2;
            
            case MINUS:
                return num1 - num2;

            case TIMES:
                return num1 * num2;
            
            case DIVIDE:
                return num1 / num2;
        } // end switch-case

        return 0; // This is needed to ensure that a value is returned.
    } // end method calculate
} // end enum Operation

class P2
{
    public static void main(String[] args)
    {
        System.out.print(Operation.DIVIDE.calculate(1, 3));
    } // end main
} // end class P2