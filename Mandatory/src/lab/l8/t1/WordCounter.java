/*
 * @Description: Task 1
 * @Version: 1.0.1.20210211
 * @Author: Arvin Zhao
 * @Date: 2021-02-11 10:57:34
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-11 11:02:11
 */

package lab.l8.t1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WordCounter
{
    private final Map<Character, String> longestWords;
    private final Map<Character, String> mostWords;
    private final List<String> words;

    /**
     * A definition of a word counter.
     * @throws IOException throw a specified exception when the file is not found
     */
    WordCounter() throws IOException
    {
        words = Files.readAllLines(Paths.get("res/words.txt"));
        longestWords = new HashMap<>();
        mostWords = new HashMap<>();
    } // end constructor

    /**
     * Get the longest word starting with the specified letter.
     * @param c the specified letter
     * @return the longest word starting with the specified letter
     */
    String longestWordStartingWith(char c)
    {
        if (!(Character.isLetter(c) && Character.isLowerCase(c)))
            throw new IllegalArgumentException("Invalid: " + c);

        if (longestWords.containsKey(c))
            return longestWords.get(c);

        String longestWord = "";

        for (String word : words)
            if (word.toLowerCase().charAt(0) == c && word.length() > longestWord.length())
                longestWord = word;

        longestWords.put(c, longestWord);
        return longestWord;
    } // end method longestWordStartingWith

    /**
     * Get the word with the most occurrences of the specified letter.
     * @param c the specified letter
     * @return the word with the most occurrences of the specified letter
     */
    String wordWithMostOccurrencesOf(char c)
    {
        if (!(Character.isLetter(c) && Character.isLowerCase(c)))
            throw new IllegalArgumentException("Invalid: " + c);

        if (mostWords.containsKey(c))
            return mostWords.get(c);

        String mostWord = "";
        int mostCount = 0;

        for (String word : words)
        {
            int count = 0;

            for (char c2 : word.toLowerCase().toCharArray())
                if (c2 == c)
                    count++;

            if (count > mostCount)
            {
                mostWord = word;
                mostCount = count;
            } // end if
        } // end for

        mostWords.put(c, mostWord);
        return mostWord;
    } // end method wordWithMostOccurrencesOf

    public static void main(String[] args) throws Exception
    {
        WordCounter wc = new WordCounter();

        for (char c = 'a'; c <= 'z'; c++)
            System.out.println(c + ": " + wc.longestWordStartingWith(c) + ", " + wc.wordWithMostOccurrencesOf(c));
    } // end main
} // end class WordCounter