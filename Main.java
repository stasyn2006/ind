
public class Main {
    public static void main(String[] args) {
        Film obj1 = new Film("Avengers", 2003, "Joss Whedon", 4.4);
        obj1.setName("Avengers");
        obj1.setReleaseYear(2003);
        obj1.setDirector("Joss Whedon");
        obj1.setRating(4.5);

        Shooting obj2 = new Shooting(20000000, 50, 150);
        obj2.setPrice(200000000);
        obj2.setActors(51);
        obj2.setFilm_crew(140);

        System.out.println("Iнформацiя пр фiльм:");
        System.out.println("getName: " + obj1.getName());
        System.out.println("getReleaseYear: " + obj1.getReleaseYear());
        System.out.println("getDirector: " + obj1.getDirector());
        System.out.println("getRating: " + obj1.getRating());

        System.out.println("Додаткова iнформацiя");
        System.out.println("getPrice: " + obj2.getPrice());
        System.out.println("getActors: " + obj2.getActors());
        System.out.println("getFilm_crew: " + obj2.getFilm_crew());
    }
}