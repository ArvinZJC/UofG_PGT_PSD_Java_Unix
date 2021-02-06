/*
 * @Description: a part of Task 4
 * @Version: 1.0.3.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-02 22:56:33
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 22:11:09
 */

package lab.l6.t4;

class Main
{
    public static void main(String[] args)
    {
        Monster fireMonster = new Monster("Fire", 200, 100, new String[] { "Water" });
        Monster waterMonster = new Monster("Water", 130, 50, new String[] { "Fire", "Electric" });

        System.out.println(waterMonster.attack(fireMonster));
        System.out.println(fireMonster.getHitPoints());
        System.out.println(fireMonster.getAttackPoints());
        System.out.println(fireMonster.getType());
    } // end main
} // end class Main