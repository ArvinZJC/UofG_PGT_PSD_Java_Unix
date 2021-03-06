/*
 * @Description: a part of Task 5
 * @Version: 1.0.3.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 08:21:08
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 22:12:24
 */

package labs.l6.t5;

class FireMonster extends Monster
{
    private boolean lastDodge = false;

    /**
     * A monster with type "Fire" in a monster-battling game.
     * @param hitPoints a number of hit points
     * @param attackPoints a number of attack points
     */
    FireMonster(int hitPoints, int attackPoints)
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