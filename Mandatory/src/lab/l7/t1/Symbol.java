/*
 * @Description: a part of Task 1
 * @Version: 1.0.0.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 12:58:13
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 15:44:18
 */

package lab.l7.t1;

enum Symbol
{
    ROCK, PAPER, SCISSORS;

    /**
     * Get the game result.
     * @param s the symbol type
     * @return the game result
     */
    GameResult getResult(Symbol s)
    {
        if (this == s)
            return GameResult.DRAW;

        return switch (this) {
            case ROCK -> s == SCISSORS ? GameResult.WIN : GameResult.LOSE;
            case PAPER -> s == ROCK ? GameResult.WIN : GameResult.LOSE;
            case SCISSORS -> s == PAPER ? GameResult.WIN : GameResult.LOSE;
        };
    } // end method getResult
} // end enum Symbol