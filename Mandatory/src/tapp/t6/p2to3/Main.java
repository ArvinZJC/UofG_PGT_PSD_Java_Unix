/*
 * @Description: a part of Problems 2 & 3
 * @Version: 1.0.3.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-02 01:39:39
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 22:13:05
 */

package tapp.t6.p2to3;

class Main
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("Arvin", "Zhao", 1, 20.5, 10, 8);

        System.out.println(employee.printInfo());
        System.out.println("Employee's pay for the current month: " + employee.computePay());
    } // end main
} // end class Main