public class Monster {
    private Boolean isAlive = true;
    private int hp = 2000;
    private int damage = 150;

    public static void main(String[] args) {
        
    }

    public Boolean isAlive() {
        return isAlive;
    }

    public int attack(Protagonist target) {
        return 0;
    }

    public void attacked(int damage) {
        hp -= damage;
        System.out.println(hp);
    }

}
