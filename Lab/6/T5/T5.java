/*
 * @Description: Task 5
 * @Version: 1.0.0.20210203
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 08:21:08
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-03 10:17:15
 */

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
     * Get the monster's hit points.
     * @return the monster's hit points.
     */
    public int getHitPoints() { return hitPoints; }

    /**
     * Get the monster's attack points.
     * @return the monster's attack points.
     */
    public int getAttackPoints() { return attackPoints; }

    /**
     * Get the monster's type.
     * @return the monster's type.
     */
    public String getType() { return this.type; }

    /**
     * The current monster attacks the other monster.
     * @param otherMonster the object representing the other monster
     * @return a {@code boolean} indicating the result
     */
    public boolean attack(Monster otherMonster)
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
     * Indicate if a monster can dodge any attack.
     * @return a {@code boolean} indicating if a monster can dodge any attack
     */
    protected abstract boolean dodge();

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

class WaterMonster extends Monster
{
    /**
     * A monster with type "Water" in a monster-battling game.
     * @param hitPoints a number of hit points
     * @param attackPoints a number of attack points
     */
    public WaterMonster(int hitPoints, int attackPoints)
    {
        super("Water", hitPoints, attackPoints, new String[] { "Fire", "Electric" });
    } // end constructor

    @Override
    protected boolean dodge()
    {
        return hitPoints >= 100;
    } // end method dodge
} // end class WaterMonster

class FireMonster extends Monster
{
    private boolean lastDodge = false;

    /**
     * A monster with type "Fire" in a monster-battling game.
     * @param hitPoints a number of hit points
     * @param attackPoints a number of attack points
     */
    public FireMonster(int hitPoints, int attackPoints)
    {
        super("Fire", hitPoints, attackPoints, new String[] { "Water" });
    } // end constructor

    @Override
    protected boolean dodge()
    {
        lastDodge = !lastDodge;
        return lastDodge;
    } // end method dodge
} // end class FireMonster

class ElectricMonster extends Monster
{
    /**
     * A monster with type "Electric" in a monster-battling game.
     * @param hitPoints a number of hit points
     * @param attackPoints a number of attack points
     */
    public ElectricMonster(int hitPoints, int attackPoints)
    {
        super("Electric", hitPoints, attackPoints, new String[0]);
    } // end constructor

    @Override
    protected boolean dodge()
    {
        return false;
    } // end method dodge
} // end class ElectricMonster

class T5
{
    public static void main(String[] args)
    {
        FireMonster fireMonster = new FireMonster(200, 100);
        WaterMonster waterMonster = new WaterMonster(130, 50);
        ElectricMonster electricMonster = new ElectricMonster(100, 80);

        System.out.println(waterMonster.attack(fireMonster));
        System.out.println(electricMonster.attack(fireMonster));
        System.out.println(waterMonster.attack(electricMonster));
        System.out.println(fireMonster.getHitPoints());
    } // end main
} // end class T5