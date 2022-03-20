/* DJ - David Chen, Jason Yang
   APCS
   HW23 -- What does Equality Look Like?
   2021-10-23
   time spent: 1.0 hours
   DISCO: Printing the object name automatically invokes the toString() method of the class.
          Math.random returns a random value between 0.0 and 1.0
   QCC: N/A
 */
public class Coin {

  // attributes aka instance vars
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;

  /***
   * Coin() -- default constuctor precond: postcond:
   ***/
  public Coin() {
    bias = 0.5;
    upFace = "heads";
  }

  /***
   * Coin(String) -- overloaded constructor precond: input is one of "penny",
   * "nickel", "dime", "quarter", "half dollar", "dollar" postcond:
   ***/
  public Coin(String s) {
    if (s == "penny" || s == "nickel" || s == "dime" || s == "quarter" || s == "half dollar" || s == "dollar") {
      name = s;
      bias = 0.5;
      upFace = "heads";
    }
  }

  /***
   * Coin(String,String) -- precond: postcond:
   ***/
  public Coin(String s, String nowFace) {
    if (s == "penny" || s == "nickel" || s == "dime" || s == "quarter" || s == "half dollar" || s == "dollar") {
      if (nowFace == "heads" || nowFace == "tails") {
        name = s;
        upFace = nowFace;
        bias = 0.5;
      }
    }
  }

  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }
  // ----------------------------

  /***
   * assignValue() -- set a Coin's monetary value based on its name precond: input
   * String is a valid coin name ("penny", "nickel", etc.) postcond: instvar value
   * gets appropriate value Returns value assigned.
   ***/
  private double assignValue(String s) {
    if (s == "penny" || s == "nickel" || s == "dime" || s == "quarter" || s == "half dollar") {
      if (s == "penny") {
        value = 0.01;
      } else if (s == "nickel") {
        value = 0.05;
      } else if (s == "dime") {
        value = 0.1;
      } else if (s == "quarter") {
        value = 0.25;
      } else if (s == "half dollar") {
        value = 0.50;
      } else if (s == "dollar")
        value = 1.00;
    } else {
      System.out.println("Invalid coin name.");
      return 0.0;
    }
    return value;
  }

  /***
   * reset() -- initialize a Coin precond: s is "heads" or "tails", 0.0 <= d <=
   * 1.0 postcond: Coin's attribs reset to starting vals
   ***/
  public void reset(String s, double d) {
    if ((s == "heads" || s == "tails") && (d >= 0.0 && d <= 1.0)) {
      upFace = s;
      bias = 0.5;
      flipCtr = 0;
      headsCtr = 0;
      tailsCtr = 0;
    }
  }

  /***
   * String flip() -- simulates a Coin flip precond: bias is a double on interval
   * [0.0,1.0] (1.0 indicates always heads, 0.0 always tails) postcond: upFace
   * updated to reflect result of flip. flipCtr incremented by 1. Either headsCtr
   * or tailsCtr incremented by 1, as approp. Returns "heads" or "tails"
   ***/
  public String flip() {
    // bias = Math.random();
    double prob = Math.random();
    if (prob < bias) {
      upFace = "heads";
      headsCtr++;
    } else {
      upFace = "tails";
      tailsCtr++;
    }
    flipCtr++;
    return upFace;
  }

  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up precond:
   * other is not null postcond: Returns true if both coins showing heads or both
   * showing tails. False otherwise.
   ***/
  public boolean equals(Coin other) {
    if (other != null && other.upFace == this.upFace) {
      return true;
    }
    return false;
  }

  /***
   * String toString() -- overrides toString() provided by Java precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return name + " -- " + upFace;
  }

}// end class
