/*
 * @Description: a part of Task 3
 * @Version: 1.0.0.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 23:03:41
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 23:47:18
 */

package lab.l7.t2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinTest
{
    private List<Integer> nums;

    @BeforeEach
    void setUp()
    {
        nums = Arrays.asList(75, 50, 20, 60, 40, 50);
    } // end method setUp

    @AfterEach
    void tearDown()
    {
        nums = null;
    } // end method tearDown

    @Test
    void getSpaceTest()
    {
        Bin b1 = new Bin(100);
        assertEquals(100, b1.getSpace(), "Bin.getSpace() should return capacity when empty.");

        b1.store(30);
        assertEquals(70, b1.getSpace(), "Bin.getSpace() should return correct remaining space after store().");
    } // end method getSpaceTest

    @Test
    void storeTest()
    {
        Bin b1 = new Bin(100);
        b1.store(60);
        assertThrows(IllegalArgumentException.class, () -> b1.store(60));
    } // end method storeTest

    @Test
    void bestFitStrategyTest()
    {
        Set<Bin> bins = new BestFitStrategy().pack(100, nums);
        int totalSpace = 0;

        for (Bin b : bins)
        {
            int space = b.getSpace();
            totalSpace += space;
            assertTrue(space >= 0, "Bins should have non-negative space left.");
        } // end for

        assertEquals(5, totalSpace, "Total remaining space should be 5 on test set.");
    } // end method bestFitStrategyTest

    @Test
    void firstFitStrategyTest()
    {
        Set<Bin> bins = new FirstFitStrategy().pack(100, nums);
        int totalSpace = 0;

        for (Bin b : bins)
        {
            int space = b.getSpace();
            totalSpace += space;
            assertTrue(space >= 0, "Bins should have non-negative space left.");
        } // end for

        assertEquals(5, totalSpace, "Total remaining space should be 5 on test set.");
    } // end method firstFitStrategyTest

    @Test
    void nextFitStrategyTest()
    {
        Set<Bin> bins = new NextFitStrategy().pack(100, nums);
        int totalSpace = 0;

        for (Bin b : bins)
        {
            int space = b.getSpace();
            totalSpace += space;

            assertTrue(space >= 0, "Bins should have non-negative space left.");
        } // end for

        assertEquals(105, totalSpace, "Total remaining space should be 5 on test set.");
    } // end method nextFitStrategyTest
} // end class BinTest