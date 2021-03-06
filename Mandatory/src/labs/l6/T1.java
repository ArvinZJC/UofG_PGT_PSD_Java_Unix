/*
 * @Description: Task 1
 * @Version: 1.0.3.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-02 22:23:10
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 22:36:22
 */

package labs.l6;

class T1
{
    /**
     * Compute and print the list of prime numbers less than a given parameter.
     * @param max a given parameter
     */
    private static void printPrimes(@SuppressWarnings("SameParameterValue") int max)
    {
        for (int n = 2; n < max; n++)
        {
            boolean isPrime = true;

            for (int f = 2; f <= Math.sqrt(n); f++)
                if (n % f == 0)
                {
                    isPrime = false;
                    break;
                } // end if

            if (isPrime)
                System.out.println(n + " is prime.");
        } // end for
    } // end method printPrimes

    public static void main(String[] args)
    {
        printPrimes(20);
    } // end main
} // end class T1