import game.Game;
import game.utils.Terminal;

public class Main {

    public static void main(String[] args){
        new Game(new Terminal()).go();
    }

}