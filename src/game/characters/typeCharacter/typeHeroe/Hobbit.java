package game.characters.typeCharacter.typeHeroe;

import game.characters.typeCharacter.Heroe;
import game.dictionarys.LifeDict;
import game.characters.Character;

public class Hobbit extends Heroe{
    
    public Hobbit(String name, int armor){
        super(name, LifeDict.LIFE_HOBBIT, armor);
    }

    public void particularMove(Character enemy){
        if(enemy.getType().equals("Trasgos"))
            this.setDamage(this.getDamage() - 5);
    }

}
