/*
 * @Description: a part of Task 2
 * @Version: 1.0.0.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 18:16:06
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 19:24:14
 */

package lab.l7.t2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class NextFitStrategy implements PackingStrategy
{
    /**
     * Pack an item.
     * @param capacity a bin's capacity
     * @param values a list of items
     * @return a set of bins
     */
    @Override
    public Set<Bin> pack(int capacity, List<Integer> values)
    {
        Set<Bin> result = new HashSet<>();
        Bin currentBin = null;

        for (int value : values)
        {
            if (currentBin == null || value > currentBin.getSpace())
            {
                Bin newBin = new Bin(capacity);
                result.add(newBin);
                currentBin = newBin;
            } // end if

            currentBin.store(value);
        } // end for

        return result;
    } // end method pack
} // end class NextFitStrategy