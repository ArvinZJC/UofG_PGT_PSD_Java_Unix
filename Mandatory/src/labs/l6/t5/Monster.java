/*
 * @Description: a part of Task 5
 * @Version: 1.0.3.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 08:21:08
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 22:12:24
 */

package labs.l6.t5;

import java.util.Arrays;

abstract class Monster
{
    protected String type;
    protected int hitPoints;
    protected int attackPoints;
    protected String[] weaknesses;

    /**
     * A monster in a monster-battling game.
     * @param type the monster's type
     * @param hitPoints a number of hit points
     * @param attackPoints a number of attack points
     * @param weaknesses list of weaknesses
     */
    protected Monster(String type, int hitPoints, int attackPoints, String[] weaknesses)
    {
        this.type = type;
        this.hitPoints = hitPoints;
        this.attackPoints = attackPoints;
        this.weaknesses = weaknesses;
    } // end constructor

    /**
     * Indicate if a monster can dodge any attack.
     * @return a {@code boolean} indicating if a monster can dodge any attack
     */
    protected abstract boolean dodge();

    /**
     * Get the monster's hit points.
     * @return the monster's hit points.
     */
    int getHitPoints() { return hitPoints; }

    /**
     * Get the monster's attack points.
     * @return the monster's attack points.
     */
    int getAttackPoints() { return attackPoints; }

    /**
     * Get the monster's type.
     * @return the monster's type.
     */
    String getType() { return this.type; }

    /**
     * The current monster attacks the other monster.
     * @param otherMonster the object representing the other monster
     * @return a {@code boolean} indicating the result
     */
    boolean attack(Monster otherMonster)
    {
        // A monster cannot attack itself.
        if (otherMonster == this)
            return false;

        // A monster cannot attack or be attacked if it is knocked out.
        if (this.hitPoints <= 0 || otherMonster.getHitPoints() <= 0)
            return false;

        if (otherMonster.dodge())
        {
            this.removeHitPoints(10);
            return false;
        }
        else
        {
            boolean otherIsWeak = otherMonster.isWeakAgainst(type); // Check if the other monster is weak against our type.
            int pointsToRemove = otherIsWeak ? this.attackPoints + 20 : this.attackPoints;
            otherMonster.removeHitPoints(pointsToRemove);
            return true;
        } // end if...else
    } // end method attack

    /**
     * Check if a monster is weak against the type.
     * @param otherType a specified type
     * @return a {@code boolean} indicating the result
     */
    private boolean isWeakAgainst(String otherType)
    {
        for (String weakness : this.weaknesses)
            if (weakness.equals(otherType))
                return true;

        return false;
    } // end method isWeakAgainst

    /**
     * Remove a monster's hit points.
     * @param points the hit points to remove
     */
    private void removeHitPoints(int points)
    {
        this.hitPoints -= points;

        // A monster is knocked out.
        if (hitPoints <= 0)
            hitPoints = 0;
    } // end method removeHitPoints

    @Override
    public String toString()
    {
        return "Monster [type=" + type + ", hitPoints=" + hitPoints + ",attackPoints=" + attackPoints + ", weaknesses=" + Arrays.toString(weaknesses) + "]";
    } // end method toString
} // end abstract class Monster