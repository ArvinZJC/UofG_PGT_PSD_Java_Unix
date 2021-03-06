/*
 * @Description: a part of Task 3
 * @Version: 1.0.2.20210306
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 22:39:13
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-03-06 23:47:01
 */

package labs.l7.t1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SymbolTest
{
    /**
     * Test the results of rock.
     */
    @Test
    void rockTest()
    {
        assertEquals(GameResult.WIN, Symbol.ROCK.getResult(Symbol.SCISSORS), "Rock should beat scissors.");
        assertEquals(GameResult.LOSE, Symbol.ROCK.getResult(Symbol.PAPER), "Rock should lose to paper.");
    } // end method rockTest

    /**
     * Test the results of paper.
     */
    @Test
    void paperTest()
    {
        assertEquals(GameResult.WIN, Symbol.PAPER.getResult(Symbol.ROCK), "Paper should beat rock.");
        assertEquals(GameResult.LOSE, Symbol.PAPER.getResult(Symbol.SCISSORS), "Paper should lose to scissors.");
    } // end method paperTest

    /**
     * Test the results of scissors.
     */
    @Test
    void scissorsTest()
    {
        assertEquals(GameResult.WIN, Symbol.SCISSORS.getResult(Symbol.PAPER), "Scissors should beat paper.");
        assertEquals(GameResult.LOSE, Symbol.SCISSORS.getResult(Symbol.ROCK), "Scissors should lose to rock.");
    } // end method scissorsTest

    /**
     * Test if the result "drawing" works as expected.
     */
    @Test
    void equalTest()
    {
        for (Symbol s : Symbol.values())
            assertEquals(GameResult.DRAW, s.getResult(s), "An object should always draw with itself.");
    } // end method equalTest
} // end class SymbolTest