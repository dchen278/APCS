/*
BDY: David Chen, Yat Long Chan, Ben Belotser, Eugene, Bob, TwoFace
David Chen
APCS
HW14: Customize Your Creation
2021-10-07

DISCO
Constructors are used to initialize objects and set initial values for
object attributes. It should be the first method in the class. This \
constructor is called when the Class is first created.
QCC
None
*/

public class BigSib {
    String helloMsg;

    public BigSib(String greeting) {
        setHelloMsg(greeting);
    }

    public String greet(String name) {
        return helloMsg + " " + name;
    }

    public void setHelloMsg(String msg) {
        helloMsg = msg;
    }
}