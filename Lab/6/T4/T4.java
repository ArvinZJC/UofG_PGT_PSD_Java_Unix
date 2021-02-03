/*
 * @Description: Task 4
 * @Version: 1.0.1.20210203
 * @Author: Arvin Zhao
 * @Date: 2021-02-02 22:56:33
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-03 10:04:18
 */

import java.util.Arrays;

class Monster
{
    protected String type;
    protected int hitPoints;
    protected int attackPoints;
    protected String[] weaknesses;

    /**
     * A simplified monster in a monster-battling game.
     * @param type the monster's type
     * @param hitPoints a number of hit points
     * @param attackPoints a number of attack points
     * @param weaknesses list of weaknesses
     */
    public Monster(String type, int hitPoints, int attackPoints, String[] weaknesses)
    {
        this.type = type;
        this.hitPoints = hitPoints;
        this.attackPoints = attackPoints;
        this.weaknesses = weaknesses;
    } // end constructor Monster

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
        
        boolean otherIsWeak = otherMonster.isWeakAgainst(type); // Check if the other monster is weak against our type.
        int pointsToRemove = otherIsWeak ? this.attackPoints + 20 : this.attackPoints;
        otherMonster.removeHitPoints(pointsToRemove);
        return true;
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
        return "Monster [type = " + type + ", hitPoints = " + hitPoints + ", attackPoints = " + attackPoints + ", weaknesses = " + Arrays.toString(weaknesses) + "]";
    } // end method toString
} // end class Monster

class T4
{
    public static void main(String[] args)
    {
        Monster fireMonster = new Monster("Fire", 200, 100, new String[] { "Water" });
        Monster waterMonster = new Monster("Water", 130, 50, new String[] { "Fire", "Electric" });

        System.out.println(waterMonster.attack(fireMonster));
        System.out.println(fireMonster.getHitPoints());
    } // end main
} // end class T4