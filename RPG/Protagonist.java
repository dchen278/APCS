public class Protagonist {
    private String name;
    private Boolean isAlive = true;
    private int hp = 2000;
    // private int damage = 300;
    private Boolean specialized;

    public static void main(String[] args) {
        
    }

    public Protagonist(String GivenName) {
        name = GivenName;
    }

    public int chance(int chance) {
        return (int) (Math.random() * chance);
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

    public void attacked(int damage) {
        hp -= damage;
        System.out.println(hp);
    }

    public int attack(Monster target) {
        if(specialized) {
            if(chance(10) > ) {

            }
        }
        target.attacked(damage); 
    }
}
