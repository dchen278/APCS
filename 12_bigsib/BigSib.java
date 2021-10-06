/*
BDY: David Chen, Yat Long Chan, Ben Belotser, Eugene, Bob, TwoFace
David Chen
APCS
HW12: On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

DISCO
Instance variables can only be used in non static methods
QCC
None
*/

public class BigSib {
    String helloMsg;

    public String greet(String name) {
        return helloMsg + " " +  name;
	}

    public void setHelloMsg(String name) {
        helloMsg = name;
    }
}
