/*
 * @Description: Tasks 2 & 3
 * @Version: 1.0.0.20210211
 * @Author: Arvin Zhao
 * @Date: 2021-02-11 15:42:16
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-11 15:43:32
 */
package lab.l8.t2to3;

import java.util.TreeSet;

class Main
{
    public static void main(String[] args)
    {
        WishList wishList = new WishList();
        BrickSet brickSet1 = new BrickSet(0, "Jichen", "Space", 20, 0);

        System.out.println(brickSet1.getSetNumber());
        System.out.println(brickSet1.getName());
        System.out.println(brickSet1.getTheme());
        System.out.println(brickSet1.getNumPieces());

        brickSet1.setRetailPrice(1);
        System.out.println(brickSet1.getRetailPrice());

        brickSet1.setRetailPrice(16.78);
        System.out.println(brickSet1.getRetailPrice());
        System.out.println(brickSet1.getPricePerPiece());

        if (wishList.addSet(brickSet1))
        {
            wishList.addSet(new BrickSet(1, "Arvin", "Ninjas", 160, 155.21));

            if (wishList.removeSet(brickSet1))
                System.out.println("Removed successfully.");
        } // end if

        TreeSet<BrickSet> sets = wishList.getSets();

        for (BrickSet set : sets)
            System.out.println(set);
    } // end main
} // end class Main