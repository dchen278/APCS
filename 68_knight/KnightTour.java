// APCS pd8
// Hand Sanitizers (Yat Long Chan + Diana Akhmedova + David Chen)
// HW68 -- ...and T-, Tr-, Tri-, Tries Again Until It's Done / Completed Knight's Tour class
// 2022-02-28m
// time spent: 0.5 hr

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO:
 * - If all squares have been visited:
 *    - Solution has been found.
 * - Else:
 *    - Check possible movement of the knight at current position.
 *    - If the move is valid, recursively check the next positions for a solution.
 *    - If a move is invalid, backtrack and check the alternatives.If all alternatives are invalid, no solution exists.
 *
 * DISCO:
 * - A knight can make a total of 8 different L-shaped moves.
 * - The execution time appears to increase by a factor of 40.6.
 *
 * QCC:
 * - How do we calculate the number of possible solutions for any board size?
 *
 * Mean execution times for boards of size n*n:
 * n=5   6.7608s    across 5 executions
 * n=6   274.488s    across 1 execution
 * n=7   _s    across 1 execution
 * n=8   _s    across 1 execution
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/

import java.io.*;
import java.util.*;

public class KnightTour {
  public static void main(String[] args) {
    int n = 8;

    try {
      n = Integer.parseInt(args[0]);
    } catch (Exception e) {
      System.out.println("Invalid input. Using board size "
          + n + "...");
    }

    TourFinder tf = new TourFinder(n);

    // clear screen using ANSI control code
    System.out.println("#[2J");

    // display board
    System.out.println(tf);

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // for fixed starting location, use line below:
    // tf.findTour( 2, 2, 1);
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // for random starting location, use lines below:
    int startX = (int) (Math.random() * n);
    int startY = (int) (Math.random() * n);
    while (startX == 0 || startX == 1) {
      startX = (int) (Math.random() * n + 2);
    }
    while (startY == 0 || startY == 1) {
      startY = (int) (Math.random() * n + 2);
    }
    tf.findTour(startX, startY, 1); // 1 or 0 ?
    /*
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */

    /*
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * PUSHING FARTHER...
     * Systematically attempt to solve from every position on the board?
     * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     */
    // find tours from every position on the board

    for (int i = 2; i < n + 2; i++) {
      for (int j = 2; j < n + 2; j++) {
        tf.findTour(i, j, 1);
      }
    }

  }// end main()

}// end class KnightTour

class TourFinder {
  // instance vars
  private int[][] _board;
  private int _sideLength; // board has dimensions n x n
  private boolean _solved = false;

  // constructor -- build board of size n x n
  public TourFinder(int n) {
    _sideLength = n;

    // init 2D array to represent square board with moat
    _board = new int[_sideLength + 4][_sideLength + 4];

    // SETUP BOARD -- 0 for unvisited cell
    // -1 for cell in moat
    // ---------------------------------------------------------
    for (int x = 0; x < _board.length; x++) {
      for (int y = 0; y < _board.length; y++) {
        if (x == 0 || y == 0 || x == 1 || y == 1 || x == _board.length - 1 ||
            y == _board.length - 1 || x == _board.length - 2 || y == _board.length - 2) {
          _board[y][x] = -1;
        } else {
          _board[y][x] = 0;
        }
      }
    }

    // ---------------------------------------------------------

  }// end constructor

  /**
   * "stringify" the board
   **/
  public String toString() {
    // send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "#[0;0H";
    // emacs shortcut: C-q, then press ESC
    // emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for (i = 0; i < _sideLength + 4; i++) {
      for (j = 0; j < _sideLength + 4; j++)
        retStr = retStr + String.format("%3d", _board[j][i]);
      // "%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }

  /**
   * helper method to keep try/catch clutter out of main flow
   * 
   * @param n delay in ms
   **/
  private void delay(int n) {
    try {
      Thread.sleep(n);
    } catch (InterruptedException e) {
      System.exit(0);
    }
  }

  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * 
   * @param x     starting x-coord
   * @param y     starting y-coord
   * @param moves number of moves made so far
   **/
  public void findTour(int x, int y, int moves) {
    // delay(50); //slow it down enough to be followable

    // if a tour has been completed, stop animation
    if (_solved)
      System.exit(0);

    // primary base case: tour completed
    if (moves == _sideLength * _sideLength + 1) {
      System.out.println(toString());
      _solved = true;
      System.out.println(this); // refresh screen
      return;
    }
    // other base case: stepped off board or onto visited cell
    if (_board[x][y] != 0) {
      return;
    }
    // otherwise, mark current location
    // and recursively generate tour possibilities from current pos
    else {

      // mark current cell with current move number
      _board[x][y] = moves;

      System.out.println(this); // refresh screen

      // delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       * . e . d .
       * f . . . c
       * . . @ . .
       * g . . . b
       * . h . a .
       ******************************************/
      findTour(x + 1, y + 2, moves + 1); // a
      findTour(x + 2, y + 1, moves + 1); // b
      findTour(x + 2, y - 1, moves + 1); // c
      findTour(x + 1, y - 2, moves + 1); // d
      findTour(x - 1, y - 2, moves + 1); // e
      findTour(x - 2, y - 1, moves + 1); // f
      findTour(x - 2, y + 1, moves + 1); // g
      findTour(x - 1, y + 2, moves + 1); // h

      // If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
      _board[x][y] = 0;

      System.out.println(this); // refresh screen
    }
  }// end findTour()

}// end class TourFinder
