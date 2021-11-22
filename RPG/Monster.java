public class Monster {
    private Boolean isAlive = true;
    private int hp = 2000;
    private int damage = 300;

    public static void main(String[] args) {
        
    }

    public Boolean isAlive() {
        return isAlive;
    }

    public int attack(Protagonist target) {
        int actualDamage = (int) (Math.random() * damage + 200);
        target.attacked(actualDamage);
        // target.hp -= damage;
        return actualDamage;
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
