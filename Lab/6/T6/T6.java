/*
 * @Description: Task 6
 * @Version: 1.0.0.20210203
 * @Author: Arvin Zhao
 * @Date: 2021-02-03 10:16:18
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-03 12:08:51
 */

class T6
{
    static boolean checkCardNumber(String cardNumber)
    {
        // Check length first. It cannot be valid if length is out of range.
        if (cardNumber.length() < 13 || cardNumber.length() > 19)
            return false;
        
        // Check for a valid prefix, and also check for correct length while doing this.
        switch (cardNumber.charAt(0))
        {
            case '4':
                // Visa cards should be 13, 16, or 19 digits long.
                if (cardNumber.length() != 13 && cardNumber.length() != 16 && cardNumber.length() != 19)
                    return false;
                break;

            case '3':
                // American Express cards should have 4 or 7 as second digit and should be 15 digits long.
                if (cardNumber.length() != 15)
                    return false;
                char digit2 = cardNumber.charAt(1);
                if (digit2 != '4' && digit2 != '7')
                    return false;
                break;

            case '5':
                // MasterCard (old cards) should have 16 digits with prefix between 51 and 55.
                if (cardNumber.length() != 16)
                    return false;
                int prefix = Integer.parseInt(cardNumber.substring(0, 2));
                if (prefix < 51 || prefix > 55)
                    return false;
                break;

            case '2':
                // MasterCard (new cards) -- should be 16 digits with prefix between 2221 and 2720.
                if (cardNumber.length() != 16)
                    return false;
                int prefix2 = Integer.parseInt(cardNumber.substring(0, 4));
                if (prefix2 < 2221 || prefix2 > 2720)
                    return false;
                break;

            default:
                return false; // Prefix must be invalid so cannot be a valid number.
        } // end switch-case

        // If we get here, prefix and length must be right. Time to do the Luhn check.
        boolean even = false;
        int total = 0;

        // Loop backwards through the string one character at a time
        for (int i = cardNumber.length() - 1; i >= 0; i--)
        {
            int digit = Character.getNumericValue(cardNumber.charAt(i)); // Convert to a number.

            // Double even digits.
            if (even)
            {
                int sum = digit * 2;
                
                if (sum > 9)
                    sum -= 9;

                total += sum;
            }
            else
                total += digit;
            
            even = !even; // Even and odd alternate.
        } // end for
        
        return total % 10 == 0; // Card is valid exactly if final total is a multiple of 10.
    } // end method checkCardNumber
    
    public static void main(String[] args)
    {
        System.out.println(checkCardNumber("4024007100832814")); // Valid VISA.
        System.out.println(checkCardNumber("5479942042386973")); // Valid MasterCard.
        System.out.println(checkCardNumber("1324141313132321")); // Invalid.
    } // end main
} // end class T6