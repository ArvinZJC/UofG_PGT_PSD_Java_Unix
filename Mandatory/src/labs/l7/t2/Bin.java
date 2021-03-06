/*
 * @Description: a part of Task 2
 * @Version: 1.0.1.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 18:11:36
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 19:25:19
 */

package labs.l7.t2;

import java.util.ArrayList;
import java.util.List;

class Bin
{
    private final int capacity;
    private final List<Integer> contents;

    /**
     * A definition of a bin.
     * @param capacity a bin's capacity
     */
    Bin(int capacity)
    {
        this.capacity = capacity;
        this.contents = new ArrayList<>();
    } // end constructor

    /**
     * Get the extra capacity.
     * @return the extra capacity
     */
    int getSpace()
    {
        return capacity - contents.stream().mapToInt(s -> s).sum();
    } // end method getSpace

    /**
     * Store an item.
     * @param value an item
     * @throws IllegalArgumentException an item cannot be stored if there is no extra capacity.
     */
    void store(int value) throws IllegalArgumentException
    {
        if (value > getSpace())
            throw new IllegalArgumentException("No space: space " + getSpace() + ", size " + value);
        else
            contents.add(value);
    } // end method store

    @Override
    public String toString()
    {
        return contents.toString();
    } // end method toString
} // end class Bin