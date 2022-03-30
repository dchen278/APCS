/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr<Z>
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    // Stack<Z> cakes = new ALStack<Z>();
    Stack<Z> cakes = new LLStack<Z>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    cakes.add(9392);
    System.out.println(cakes);
    cakes.add("pog");
    System.out.println(cakes);
    cakes.add(false);
    System.out.println(cakes);
    cakes.add(2.3);
    System.out.println(cakes);
    cakes.add('a');
    System.out.println(cakes);
    cakes.add("sadbgasihdgasiudgasugbdabsakjs");
    System.out.println(cakes);

    cakes.pop();
    System.out.println(cakes);


    //...

  }//end main

}//end class
