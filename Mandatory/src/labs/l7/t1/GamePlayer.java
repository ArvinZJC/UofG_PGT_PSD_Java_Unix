/*
 * @Description: a part of Task 1
 * @Version: 1.0.1.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 13:11:21
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 14:16:29
 */

package labs.l7.t1;

import java.util.Random;

class GamePlayer
{
    private final Random rand = new Random();

    /**
     * Choose the symbol type.
     * @return the symbol type
     */
    Symbol chooseSymbol()
    {
        return Symbol.values()[rand.nextInt(Symbol.values().length)];
    } // end method chooseSymbol
} // end class GamePlayer