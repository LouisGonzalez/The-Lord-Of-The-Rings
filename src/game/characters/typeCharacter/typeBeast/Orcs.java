package game.characters.typeCharacter.typeBeast;

import game.characters.typeCharacter.Beast;
import game.dictionarys.LifeDict;
import game.characters.Character;

public class Orcs extends Beast{
    
    public Orcs(String name, int armor){
        super(name, LifeDict.LIFE_ORCS, armor);
    }

    public void particularMove(Character enemy){
        enemy.setArmor((int) (enemy.getArmor()*0.9));
    }

}
