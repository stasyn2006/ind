public class Shooting {
    private int price;
    private int actors;
    private int film_crew;

    public Shooting(int price, int actors, int film_crew) {
        this.price = price;
        this.actors = actors;
        this.film_crew = film_crew;
    }

    public int getPrice() {
        return price;
    }

    public int getActors() {
        return actors;
    }

    public int getFilm_crew() {
        return film_crew;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setActors(int actors) {
        this.actors = actors;
    }

    public void setFilm_crew(int film_crew) {
        this.film_crew = film_crew;
    }
}
