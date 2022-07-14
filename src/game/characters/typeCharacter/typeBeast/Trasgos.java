package game.characters.typeCharacter.typeBeast;

import game.characters.typeCharacter.Beast;
import game.dictionarys.LifeDict;
import game.utils.Terminal;
import game.characters.Character;

public class Trasgos extends Beast{
    
    private final Terminal terminal = new Terminal();

    public Trasgos(String name, int armor){
        super(name, LifeDict.LIFE_TRASGOS, armor);
    }

    public void particularMove(Character enemy){
        terminal.showMessage("The trasgos dont have any special move");
    }

}
