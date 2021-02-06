/*
 * @Description: a part of Task 5
 * @Version: 1.0.2.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 08:21:08
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 22:12:24
 */

package lab.l6.t5;

class Main
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
        System.out.println(fireMonster.getAttackPoints());
        System.out.println(fireMonster.getType());
    } // end main
} // end class Main