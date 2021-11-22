public class Protagonist {
    private String name;
    private Boolean isAlive = true;
    private int hp = 2000;
    // private int damage = 300;
    private Boolean specialized;
    private Boolean armor = true;

    public Protagonist(String GivenName) {
        name = GivenName;
    }

    public String getName() {
        return name;
    }

    public Boolean isAlive() {
        return isAlive;
    }

    public void specialize() {
        specialized = true;
    }

    public void normalize() {
        specialized = false;
    }

    public void attacked(int d) {
        if (!armor) {
            hp -= d * 2;
        } else {
            hp -= d;
        }

        if (hp <= 0) {
            isAlive = false;
        }
    }


    public Boolean rollDice(int numDice, int numSides) {
        int roll = 0;
        for (int i = 0; i < numDice; i++) {
            roll += (int) (Math.random() * numSides) + 1;
        }
        return roll > numSides / 2;
    }

    public int attack(Monster target) {
        int damage = 0;
        if (specialized) {
            if (rollDice(2, 6)) {
                damage = (int) (Math.random() * 100) + 300;
            } else {
                armor = false;
                damage = (int) (Math.random() * 200);
            }
        } else {
            armor = true;
            damage = (int) (Math.random() * 300);
        }
        target.attacked(damage);
        return damage;
    }
}
