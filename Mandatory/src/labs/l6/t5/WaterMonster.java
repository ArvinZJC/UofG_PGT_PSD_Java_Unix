/*
 * @Description: a part of Task 5
 * @Version: 1.0.3.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 08:21:08
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 22:12:24
 */

package labs.l6.t5;

class WaterMonster extends Monster
{
    /**
     * A monster with type "Water" in a monster-battling game.
     * @param hitPoints a number of hit points
     * @param attackPoints a number of attack points
     */
    WaterMonster(int hitPoints, int attackPoints)
    {
        super("Water", hitPoints, attackPoints, new String[] { "Fire", "Electric" });
    } // end constructor

    @Override
    protected boolean dodge()
    {
        return hitPoints >= 100;
    } // end method dodge
} // end class WaterMonster