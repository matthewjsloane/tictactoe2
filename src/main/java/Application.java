
public class Application {

    private Game game;

    public Application(Game game) {
        this.game = game;
    }


    public void run() {
        game.start();
    }
}
