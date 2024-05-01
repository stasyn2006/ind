
public class Main {
    public static void main(String[] args) {
        Film obj1 = new Film("Avengers", 2003, "Joss Whedon", 4.4);
        Shooting obj2 = new Shooting(200_000_000, 50, 150, 5);

        System.out.println("Iнформацiя пр фiльм:");
        System.out.println("name: " + obj1.name);
        System.out.println("releaseYear: " + obj1.releaseYear);
        System.out.println("director: " + obj1.director);
        System.out.println("rating: " + obj1.rating);

        System.out.println("Додаткова iнформацiя");
        System.out.println("Price: " + obj2.Price);
        System.out.println("Actors: " + obj2.Actors);
        System.out.println("Film_crew: " + obj2.Film_crew);
        System.out.println("Producers: " + obj2.Producers);
    }
}