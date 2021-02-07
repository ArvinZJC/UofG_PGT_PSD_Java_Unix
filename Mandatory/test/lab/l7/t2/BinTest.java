/*
 * @Description: a part of Task 3
 * @Version: 1.0.1.20210207
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 23:03:41
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-07 23:47:18
 */

package lab.l7.t2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BinTest
{
    private List<Integer> nums;

    /**
     * Initialise the test set before each test.
     */
    @BeforeEach
    void setUp()
    {
        nums = Arrays.asList(75, 50, 20, 60, 40, 50);
    } // end method setUp

    /**
     * Drop the test set after each test.
     */
    @AfterEach
    void tearDown()
    {
        nums = null;
    } // end method tearDown

    /**
     * Test if the method {@code getSpace()} of the class {@code Bin} works as expected.
     */
    @Test
    void getSpaceTest()
    {
        Bin b1 = new Bin(100);
        assertEquals(100, b1.getSpace(), "Bin.getSpace() should return capacity when empty.");

        b1.store(30);
        assertEquals(70, b1.getSpace(), "Bin.getSpace() should return correct remaining space after store().");
    } // end method getSpaceTest

    /**
     * Test if the method {@code store()} of the class {@code Bin} works as expected.
     */
    @Test
    void storeTest()
    {
        Bin b1 = new Bin(100);
        b1.store(60);
        assertThrows(IllegalArgumentException.class, () -> b1.store(60), "Bin.store() should raise exception when space is insufficient.");
    } // end method storeTest

    /**
     * Test if the best fit strategy works as expected.
     */
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

    /**
     * Test if the first fit strategy works as expected.
     */
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

        assertEquals(105, totalSpace, "Total remaining space should be 105 on test set.");
    } // end method firstFitStrategyTest

    /**
     * Test if the next fit strategy works as expected.
     */
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

        assertEquals(105, totalSpace, "Total remaining space should be 105 on test set.");
    } // end method nextFitStrategyTest
} // end class BinTest