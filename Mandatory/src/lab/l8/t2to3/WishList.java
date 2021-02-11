/*
 * @Description: Task 3
 * @Version: 1.0.0.20210211
 * @Author: Arvin Zhao
 * @Date: 2021-02-11 13:52:21
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-11 15:37:56
 */

package lab.l8.t2to3;

import java.util.TreeSet;

class WishList
{
    private final TreeSet<BrickSet> sets;

    /**
     * Create an initially empty WishList.
     */
    WishList()
    {
        sets = new TreeSet<>();
    } // end constructor

    /**
     * Adds a new set to the list.
     *
     * @param set the set to add
     * @return {@code true} if the set was added, otherwise {@code false}
     */
    boolean addSet(BrickSet set)
    {
        return sets.add(set);
    } // end method addSet

    /**
     * Remove the given set from the list.
     *
     * @param set the set to remove
     * @return {@code true} if the set was in the list and was removed, otherwise {@code false}
     */
    boolean removeSet(BrickSet set)
    {
        return sets.remove(set);
    } // end method removeSet

    /**
     * Return the list of {@code BrickSet} objects, in sorted order.
     *
     * @return the list of BrickSets
     */
    TreeSet<BrickSet> getSets()
    {
        return sets;
    } // end method getSets
} // end class WishList