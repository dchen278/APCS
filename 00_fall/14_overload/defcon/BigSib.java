/*
The LDM Combo: Lea Kwok, David Chen, and Max Schneider
David Chen
APCS
HW14: Customize Your Creation
2021-10-07

DISCO
If no argument is provided to the constructor, all instances created will have the same
initialization and greeting.
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