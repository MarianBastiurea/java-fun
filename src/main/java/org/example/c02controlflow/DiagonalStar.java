package org.example.c02controlflow;

/*
Write a method in Java named printSquareStar with one parameter of type int named number.
If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars (*).
This should be accomplished by using loops (see examples below).
printSquareStar(5); should print the following:
→ NOTE: For text in Code Blocks below, use code icon {...}  on Udemy
*****
** **
* * *
** **
*****

Explanation:
*****   5 stars
** **   2 stars space 2 stars
* * *   1 star space 1 star space 1 star
** **   2 stars space 2 stars
*****   5 stars

The patterns above consist of a number of rows and columns (where number is the number of rows to print).
 For each row or column, stars are printed based on four conditions (Read them carefully):
In the first or last row
In the first or last column
When the row number equals the column number
When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
 */
public class DiagonalStar {
    public static String printRectangleStar(int number) {
        String result = "";
        if (number < 5) {
            return "Invalid Value";
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || col == 1 || col == number || row == col || col == (number - row + 1)) {
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }
}
