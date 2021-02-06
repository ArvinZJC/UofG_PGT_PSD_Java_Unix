/*
 * @Description: a part of Problem 2
 * @Version: 1.0.3.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-01 10:48:01
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 11:07:21
 */

package tapp.t7.p2;

class Main
{
    public static void main(String[] args)
    {
        for (Operation operation : Operation.values())
            System.out.println(operation.calculate(1.0, 3.0));
    } // end main
} // end class Main