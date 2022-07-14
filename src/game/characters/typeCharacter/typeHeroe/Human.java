package game.characters.typeCharacter.typeHeroe;

import game.characters.typeCharacter.Heroe;
import game.dictionarys.LifeDict;
import game.utils.Terminal;
import game.characters.Character;

public class Human extends Heroe {
    
    private final Terminal terminal = new Terminal();

    public Human(String name, int armor){
        super(name, LifeDict.LIFE_HUMAN, armor);
    }

    public void particularMove(){
        terminal.showMessage("The humans dont have any special move");
    }

}
