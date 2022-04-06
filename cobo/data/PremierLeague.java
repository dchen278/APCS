import core.data.*;

public class PremierLeague {
    String name, club, position;
    int age;


    public PremierLeague(String name, String club, String position, int age) {
        this.name = name;
        this.club = club;
        this.position = position;
        this.age = age;
    }

    public static void main(String[] args) {
        DataSource ds = DataSource.connect("https://data.montgomerycountymd.gov/api/views/y636-7qmd/rows.xml"); 
        ds.setCacheTimeout(15 * 60);  
        ds.load();
    }
}