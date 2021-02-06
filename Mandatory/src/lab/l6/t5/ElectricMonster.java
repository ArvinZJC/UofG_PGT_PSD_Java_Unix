/*
 * @Description: a part of Task 5
 * @Version: 1.0.2.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 08:21:08
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 22:12:24
 */

package lab.l6.t5;

class ElectricMonster extends Monster
{
    /**
     * A monster with type "Electric" in a monster-battling game.
     * @param hitPoints a number of hit points
     * @param attackPoints a number of attack points
     */
    ElectricMonster(int hitPoints, int attackPoints)
    {
        super("Electric", hitPoints, attackPoints, new String[0]);
    } // end constructor

    @Override
    protected boolean dodge()
    {
        return false;
    } // end method dodge
} // end class ElectricMonster