/*
 * @Description: a part of Task 1
 * @Version: 1.0.0.20210206
 * @Author: Arvin Zhao
 * @Date: 2021-02-06 10:59:25
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-06 15:44:36
 */

package lab.l7.t1;

import java.util.Scanner;

class GameMain
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many rounds?");

        int rounds = in.nextInt();
        GamePlayer player = new GamePlayer();
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < rounds; i++)
        {
            System.out.println("Enter your choice:");
            Symbol userChoice = Symbol.valueOf(in.next().toUpperCase());
            Symbol computerChoice = player.chooseSymbol();
            System.out.println("User chose " + userChoice + ", computer chose " + computerChoice);

            switch (userChoice.getResult(computerChoice))
            {
                case WIN -> {
                    System.out.println("User wins!");
                    userWins++;
                }
                case LOSE -> {
                    System.out.println("System wins!");
                    computerWins++;
                }
                case DRAW -> System.out.println("Draw!");
            } // end switch-case
        } // end for

        System.out.println("User wins " + userWins + ", computer wins " + computerWins);
        in.close();
    } // end main
} // end class T1