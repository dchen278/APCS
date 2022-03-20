/*
BDY: David Chen, Yat Long Chan, Ben Belotser, Eugene, Bob, TwoFace
David Chen
APCS
HW13: Where do BigSibs Come From?
2021-10-06

DISCO
Constructors are used to initialize objects and set initial values for
object attributes. It should be the first method in the class. This \
constructor is called when the Class is first created.
QCC
None
*/

public class BigSib {
    String helloMsg;

    public BigSib() {
        helloMsg = "What's up";
    }

    public String greet(String name) {
        return helloMsg + " " + name;
    }

    public void setHelloMsg(String msg) {
        helloMsg = msg;
    }
}