/*
 * @Description: Task 2
 * @Version: 1.0.3.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-02 22:36:35
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 22:36:10
 */

package labs.l6;

class T2
{
    /**
     * Compute and return the n-th Fibonacci number.
     * @param n number n in a series
     * @return the n-th Fibonacci number
     */
    private static int computeFibonacci(@SuppressWarnings("SameParameterValue") int n)
    {
        int result = 1;
        int lastResult = 1;

        for (int i = 2; i < n; i++)
        {
            int temp = result;
            result += lastResult;
            lastResult = temp;
        } // end for
        
        return result;
    } // end method computeFibonacci

    public static void main(String[] args)
    {
        System.out.println(computeFibonacci(10));
    } // end main
} // end class T2