public class Successfully extends Shooting {
    private boolean successfully;

    public Successfully(int price, int actors, int film_crew) {
        super(price, actors, film_crew);
        this.successfully = false;
    }

    public void setSuccessfully(boolean successfully) {
        this.successfully = successfully;
    }

    public void printSuccessfullyStatus() {
        if (successfully) {
            System.out.println("Shooting successfully");
        } else {
            System.out.println("Shooting not successfully");
        }
    }
}
