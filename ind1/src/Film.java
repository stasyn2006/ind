public class Film {
    private String name;
    private int releaseYear;
    private String director;
    private double rating;

    public Film(String name, int releaseYear, String director, double rating) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
