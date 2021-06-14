/*
 * @Description: a part of the solution to the Java lab exam
 * @Version: 1.0.1.20210306
 * @Author: Jichen Zhao
 * @Date: 2021-02-25 18:40:54
 * @Last Editors: Jichen Zhao
 * @LastEditTime: 2021-03-06 18:42:01
 */

package labs.exam.trading;

import java.util.Objects;

/**
 * A {@link Trade} class represents a single trade.
 */
public class Trade
{
    private final int gems;
    private final int amount;
    private final Goods goods;

    /**
     * Initialise a trade.
     * @param gems the number of the trade's gems
     * @param amount the amount of the trade's goods
     * @param goods the type of the trade's goods
     */
    public Trade(int gems, int amount, Goods goods)
    {
        this.gems = gems;
        this.amount = amount;
        this.goods = goods;
    } // end constructor

    /**
     * Trade's gems getter.
     * @return the number of the trade's gems
     */
    public int getGems() { return gems; }

    /**
     * Trade's amount getter.
     * @return the amount of the trade's goods
     */
    public int getAmount() { return amount; }

    /**
     * Trade's goods' type getter.
     * @return the type of the trade's goods
     */
    public Goods getGoods() { return goods; }

    /**
     * Attempt to do a trade.
     * @param trader a {@link Trader} object
     * @param citizen a {@link Citizen} object
     * @throws IllegalArgumentException the current trade should be supported by the trader
     */
    public void execute(Trader trader, Citizen citizen) throws IllegalArgumentException
    {
        if (!trader.getTrades().contains(this))
            throw new IllegalArgumentException();

        if (citizen.executeTrade(this))
            trader.addRandomTrade();
    } // end method execute

    /**
     * Validate if the trades con be considered same.
     * @param object a {@link Trade} object
     * @return {@code true} if they are the same; otherwise, {@code false}
     */
    @Override
    public boolean equals(Object object)
    {
        if (this == object) return true;

        if (object == null || getClass() != object.getClass()) return false;

        Trade trade = (Trade) object;
        return gems == trade.gems && amount == trade.amount && goods == trade.goods; // Equality is based on the values of all 3 properties.
    } // end method equals

    /**
     * Return the hash code value of the {@link Trade} object.
     * @return the hash code value of the {@link Trade} object
     */
    @Override
    public int hashCode() { return Objects.hash(gems, amount, goods); }

    /**
     * Return a string representation of the trade (e.g. "1 gem for 3 BREAD").
     * @return a string representation of the trade.
     */
    @Override
    public String toString()
    {
        return gems + (gems == 1 ? " gem" : " gems") + " for " + amount + " " + goods; // Use the single form of the word "gem" to be more accurate if necessary.
    } // end method toString
} // end class Trade