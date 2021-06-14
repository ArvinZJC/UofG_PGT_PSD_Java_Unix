/*
 * @Description: a part of the solution to the Java lab exam
 * @Version: 1.0.1.20210306
 * @Author: Jichen Zhao
 * @Date: 2021-02-25 18:41:54
 * @Last Editors: Jichen Zhao
 * @LastEditTime: 2021-03-06 18:44:01
 */

package labs.exam.trading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A {@link Trader} class represents a trader.
 */
public class Trader
{
    private final List<Trade> tradeList;

    /**
     * Initialise a trader.
     */
    public Trader()
    {
        tradeList = new ArrayList<>();
        addRandomTrade();
    } // end constructor

    /**
     * Trader's trades getter.
     * @return a list of {@link Trade} objects representing the trades supported by the trader
     */
    public List<Trade> getTrades() { return tradeList; }

    /**
     * Add a random trade to the list.
     */
    public void addRandomTrade()
    {
        Random random = new Random();
        int gems = 1 + random.nextInt(5); // Randomly choose a value for the number of the trade's gems.
        int amount = 1 + random.nextInt(5); // Randomly choose a value for the amount of the trade's goods.
        Goods[] goodsArray = Goods.values(); // Get an array of all goods types.
        Goods goods = goodsArray[random.nextInt(goodsArray.length)]; // Randomly choose a value for the type of the trade's goods.

        tradeList.add(new Trade(gems, amount, goods));
    } // end method addRandomTrade
} // end class Trader