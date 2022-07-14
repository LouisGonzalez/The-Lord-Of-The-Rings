package game.characters.typeCharacter.typeHeroe;

import game.characters.typeCharacter.Heroe;
import game.dictionarys.LifeDict;
import game.characters.Character;

public class Elve extends Heroe{
    
    
    public Elve(String name, int armor){
        super(name, LifeDict.LIFE_ELVE, armor);
    }

    public void particularMove(Character enemy){
        if(enemy.getType().equals("Orcs"))
            this.setDamage(this.getDamage() + 10);
    }

}
