/*
 * @Description: a part of Task 2
 * @Version: 1.0.1.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 18:15:04
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 19:25:11
 */

package labs.l7.t2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FirstFitStrategy implements PackingStrategy
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
        Set<Bin> bins = new HashSet<>();

        for (int value : values)
        {
            Bin firstBin = null;

            for (Bin bin : bins)
            {
                if (value <= bin.getSpace())
                {
                    firstBin = bin;
                    break;
                } // end if
            } // end for

            if (firstBin == null)
            {
                firstBin = new Bin(capacity);
                bins.add(firstBin);
            } // end if

            firstBin.store(value);
        } // end for

        return bins;
    } // end method pack
} // end class FirstFitStrategy