/*
 * @Description: a part of Task 2
 * @Version: 1.0.0.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 18:16:55
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 19:23:58
 */

package lab.l7.t2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class BestFitStrategy implements PackingStrategy
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

        for (Integer value : values)
        {
            int bestFit = Integer.MAX_VALUE;
            Bin bestBin = null;

            for (Bin bin : bins)
            {
                int space = bin.getSpace();

                if (value <= space && (space - value) < bestFit)
                {
                    bestFit = bin.getSpace() - value;
                    bestBin = bin;
                } // enf if
            } // end for

            if (bestBin == null)
            {
                bestBin = new Bin(capacity);
                bins.add(bestBin);
            } // end if

            bestBin.store(value);
        } // end for

        return bins;
    } // end method pack
} // end class BestFitStrategy