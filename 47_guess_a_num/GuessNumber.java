/*
Team Incredibly Cohesive (David Chen, Jaylen Zeng, Orion Roven)
APCS pd0
HW47 -- Guess Again
2021-12-14
time spent: .6 hrs
DISCO:
*In order to randomly generate a number between 2 numbers, we decided to set _target to _lo, and then add Math.random() * (_hi-_lo+1); to _target
*The +1 is necessary to generate a random number between 2 numbers inclusive of the larger number
QCC:
*Are there other ways to generate random numbers, perhaps a class in the API that lets us generate random numbers with certain limitations?
 */

import java.util.Scanner;

public class GuessNumber {

    // instance vars
    private int _lo, _hi, _guessCtr, _target;
    Scanner sc = new Scanner(System.in);

    /*
     * ==================================================
     * constructor -- initializes a guess-a-number game
     * pre:
     * post: _lo is lower bound, _hi is upper bound,
     * _guessCtr is 1, _target is random int on range [_lo,_hi]
     * ==================================================
     */
    public GuessNumber(int a, int b) {
        _lo = Math.min(a, b);
        _hi = Math.max(a, b);
        _guessCtr = 1;

        // pick random number in range [a,b]
        _target = (int) (Math.random() * (_hi - _lo + 1)) + _lo;
    }

    /*
     * ==================================================
     * void playRec() -- Prompts a user to guess until guess is correct.
     * Uses recursion.
     * ==================================================
     */
    public void playRec() {
        System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
        int guess = sc.nextInt();
        if (guess == _target) {
            System.out.println("Correct! It took " + _guessCtr + " guesses.");
        } else if (guess < _target) {
            _lo = guess;
            System.out.println("Too low, try again...");
        } else {
            _hi = guess;
            System.out.println("Too high, try again...");
        }

        // 3 cases: we either found it, too hi, too lo
        _guessCtr++;
        playRec();
        /* YOUR CODE HERE */
    }

    /*
     * ==================================================
     * void playIter() -- Prompts a user to guess until guess is correct.
     * Uses iteration.
     * ==================================================
     */
    public void playIter() {

        int guess;
        // 3 cases: we either found it, too hi, too lo
        while (true) {
            System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
            guess = sc.nextInt();
            if (guess == _target) {
                System.out.println("Correct! It took " + _guessCtr + " guesses.");
                break;
            } else if (guess < _target) {
                _lo = guess;
                System.out.println("Too low, try again...");
            } else {
                _hi = guess;
                System.out.println("Too high, try again...");
            }
            _guessCtr++;
        }
    }

    // wrapper for playRec/playIter to simplify calling
    public void play() {
        // use one or the other below:
        // playRec();
        playIter();
    }

    // main method to run it all
    public static void main(String[] args) {
        // instantiate a new game
        GuessNumber g = new GuessNumber(1, 100);
        // start the game
        g.play();

        // GuessNumber p = new GuessNumber(1, 2); // check if _trget is assigned to [1,2] inclusive
        // p.play();

        /*-----------------------------
        -----------------------------*/
    }

}// end class GuessNumber
