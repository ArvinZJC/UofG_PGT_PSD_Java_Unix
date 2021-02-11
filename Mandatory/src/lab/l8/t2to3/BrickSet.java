/*
 * @Description: Task 2 and a part of Task 3
 * @Version: 1.0.0.20210211
 * @Author: Arvin Zhao
 * @Date: 2021-02-11 13:17:15
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-11 15:36:57
 */

package lab.l8.t2to3;

import java.util.Currency;
import java.util.Objects;

class BrickSet implements Comparable<BrickSet>
{
    private final int setNumber;
    private final String name;
    private final String theme;
    private final int numPieces;
    private double retailPrice;

    BrickSet(int setNumber, String name, String theme, int numPieces, double retailPrice)
    {
        this.name = name;
        this.theme = theme;
        this.numPieces = numPieces;
        this.retailPrice = retailPrice;
        this.setNumber = setNumber;
    } // end BrickSet

    /**
     * Compute the price per piece.
     * @return the price per piece
     */
    double getPricePerPiece()
    {
        return retailPrice / numPieces;
    } // end method getPricePerPiece

    /**
     * Get the set number.
     * @return the set number
     */
    int getSetNumber()
    {
        return setNumber;
    } // end method getSetNumber

    /**
     * Get the name.
     * @return the name
     */
    String getName()
    {
        return name;
    } // end method getName

    /**
     * Get the theme.
     * @return the theme
     */
    String getTheme()
    {
        return theme;
    } // end method getTheme

    /**
     * Get the number of pieces.
     * @return the number of pieces
     */
    int getNumPieces()
    {
        return numPieces;
    } // end method getNumPieces

    /**
     * Get the retail price.
     * @return the retail price
     */
    double getRetailPrice()
    {
        return retailPrice;
    } // end method getRetailPrice

    /**
     * Set the retail price.
     * @param retailPrice the retail price
     */
    void setRetailPrice(double retailPrice)
    {
        this.retailPrice = retailPrice;
    } // end method setRetailPrice

    @Override
    public int compareTo(BrickSet o)
    {
        return Integer.compare(this.setNumber, o.setNumber);
    } // end method compareTo

    /** Override the built-in methods to be more specific to this class. */
    @Override
    public int hashCode()
    {
        return Objects.hash(setNumber, name, theme, retailPrice, numPieces);
    } // end method hashCode

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj instanceof BrickSet)
        {
            BrickSet other = (BrickSet)obj;
            return Objects.equals(this.setNumber, other.setNumber)
                    && Objects.equals(this.name, other.name)
                    && Objects.equals(this.theme, other.theme)
                    && Objects.equals(this.retailPrice, other.retailPrice)
                    && Objects.equals(this.numPieces, other.numPieces);
        } // end if

        return false;
    } // end method equals

    @Override
    public String toString()
    {
        return this.setNumber + ": " + this.name + " (" + this.theme + ") " + this.numPieces + "pcs " + Currency.getInstance("GBP").getSymbol() + this.retailPrice;
    } // end method toString
} // end class BrickSet