/*
 * @Description: Task 3
 * @Version: 1.0.3.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-02 22:44:34
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 22:36:39
 */

package lab.l6;

class T3
{
    /**
     * Compute and return the score that you would receive in the game of Scrabble for the string given as a parameter.
     * @param str a given parameter
     * @return the score
     */
    private static int computeScore(@SuppressWarnings("SameParameterValue") String str)
    {
        int total = 0;
        str = str.toLowerCase();

        for (char c : str.toCharArray())
            switch(c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'l':
                case 'n':
                case 'o':
                case 'r':
                case 's':
                case 't':
                case 'u':
                    total++;
                    break;
                
                case 'd':
                case 'g':
                    total += 2;
                    break;
                
                case 'b':
                case 'c':
                case 'm':
                case 'p':
                    total += 3;
                    break;
                
                case 'f':
                case 'h':
                case 'v':
                case 'w':
                case 'y':
                    total += 4;
                    break;
                
                case 'k':
                    total += 5;
                    break;

                case 'j':
                case 'x':
                    total += 8;
                    break;

                case 'q':
                case 'z':
                    total += 10;
                    break;
                
                default:
                    // Nothing is needed here. Ignore all other characters.
            } // end switch-case

        return total;
    } // end method computeScore

    public static void main(String[] args)
    {
        System.out.println(computeScore("I am Arvin Zhao."));
    } // end main
} // end class T3