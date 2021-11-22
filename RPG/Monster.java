public class Monster {
    private Boolean isAlive = true;
    private int hp = 2000;
    private int damage = 200;

    public Boolean isAlive() {
        return isAlive;
    }

    public int attack(Protagonist target) {
        int actualDamage = (int) (Math.random() * damage + 100);
        int damaged = target.attacked(actualDamage);
        // target.hp -= damage;
        return damaged;
    }

    public int getHp() {
        return hp;
    }

    public void attacked(int damage) {
        hp -= damage;
        if (hp <= 0) {
            isAlive = false;
        }
    }

}
