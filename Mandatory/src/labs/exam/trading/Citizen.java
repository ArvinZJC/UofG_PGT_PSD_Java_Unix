/*
 * @Description: a part of the solution to the Java lab exam
 * @Version: 1.0.1.20210306
 * @Author: Jichen Zhao
 * @Date: 2021-02-25 18:39:54
 * @Last Editors: Jichen Zhao
 * @LastEditTime: 2021-03-06 18:45:01
 */

package labs.exam.trading;

import java.util.HashMap;

/**
 * A {@link Citizen} class represents a citizen in the game.
 */
public class Citizen
{
    private int gems;
    private final HashMap<Goods, Integer> inventory; // An inventory containing goods.

    /**
     * Initialise a citizen.
     * @param gems the number of gems owned by the citizen
     */
    public Citizen(int gems)
    {
        this.gems = gems;
        inventory = new HashMap<>(); // Create an empty inventory.
    } // end constructor

    /**
     * Gems' number getter.
     * @return the number of gems owned by the citizen
     */
    public int getGems() { return gems; }

    /**
     * Goods' amount getter.
     * @param goods a {@link Goods} type
     * @return the current amount of the indicated goods in the inventory
     */
    public int getAmount(Goods goods) { return inventory.get(goods) == null ? 0 : inventory.get(goods); }

    /**
     * Check if the given trade is possible.
     * @param trade a {@link Trade} object
     * @return {@code true} if the given trade is possible; otherwise, {@code false}
     */
    public boolean executeTrade(Trade trade)
    {
        int tradeGems = trade.getGems();

        if (tradeGems > gems)
            return false;

        Goods tradeGoods = trade.getGoods();
        gems -= tradeGems;
        inventory.put(tradeGoods, getAmount(tradeGoods) + trade.getAmount());
        return true;
    } // end method executeTrade
} // end class Citizen