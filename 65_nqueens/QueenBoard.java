// APCS pd8
// Hand Sanitizers (Yat Long Chan + Diana Akhmedova + David Chen)
// HW65: How Many Queens Can a Thinker Place, If a Thinker Can Place Queens...
// 2022-02-16w
// time spent:  hrs


/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;
  private int calls = 0;

  public QueenBoard( int size ) 
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition: 
   * If a solution is found, board shows position of N queens, 
   * returns true.
   * If no solution, board is filled with 0's, 
   * returns false.
   */
  public boolean solve()
  {
    boolean solution = solveH(0);
    printSolution();
    return solution;
  }


  /**
   *Helper method for solve. 
   */
  private boolean solveH( int col ) 
  { 
    calls++;
    // return true if all queens are placed
    if (col >= _board.length) {
      return true;
    }

    // check each space at column
    for (int row = 0; row < _board.length; row ++) {
      // if queen can be added at space, check rest of rows
      if (addQueen(row, col)) {
        if (solveH(col + 1)) {
          return true;
        }
      }
      // no queen added, time to backtrack
      removeQueen(row, col);
    }
    return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    for ( int[] arr: _board) {
      for (int pos: arr) {
        if (pos > 0) {
          System.out.print("Q ");
        } else {
        System.out.print("_ ");
        }
      }
      System.out.println();
    }
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * <General description>
   * precondition: 
   * postcondition: 
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition: 
   * postcondition: 
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition: 
   * postcondition: 
   */
  public String toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(5);
    System.out.println(b);
    /** should be...
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
       0	0	0	0	0	
    */
    
    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    /** should be...
     0	1	-1	-2	-1	
     0	0	-2	0	0	
     0	-1	0	-1	0	
     1	-1	-1	-1	-2	
     0	-1	0	0	0	
     */
    
    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
     0	1	-1	-1	-1	
     0	0	-1	0	0	
     0	0	0	-1	0	
     0	0	0	0	-1	
     0	0	0	0	0	 
     */
    QueenBoard c = new QueenBoard(8);
    System.out.println("Can be solved: " + c.solve() + " calls: " + c.calls);    

    QueenBoard d = new QueenBoard(25);
    System.out.println("Can be solved: " + d.solve() + " calls: " + d.calls);  

    QueenBoard e = new QueenBoard(50);
    System.out.println("Can be solved: " + e.solve() + " calls: " + e.calls);    
  }
  
}//end class