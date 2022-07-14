package game.characters.typeCharacter;

import game.characters.Character;
import game.utils.Terminal;
import game.utils.Validator;
import game.artifacts.*;


public abstract class Beast extends Character {
    
    private Dice dice;
    private Validator validator;
    private final int FIRST_VALUE_DICE = 0;
    private final int LAST_VALUE_DICE = 90;
    private final Terminal terminal = new Terminal();

    public Beast(String name, int life, int armor){
        super(name, life, armor);
        dice = new Dice();
        validator = new Validator();
    }

    public void attackTurn(Character enemy){
        int valueDice = dice.turnDice(FIRST_VALUE_DICE, LAST_VALUE_DICE);
        this.setDamage(valueDice);
        particularMove(enemy);
        if(validator.verifyDamage(this, enemy)){
            enemy.setLife(this.getDamage() - enemy.getArmor());
            enemy.setArmor(0);
            terminal.showMessage("*****************************************************");
            terminal.showMessage(enemy.getName() + " of the batallion of the heroes has received " + this.getDamage());
            validator.verifyStatusCharacter(enemy);
            if(!enemy.getIsAlive())
                terminal.showMessage(enemy.getName() + " of the batallion of the heroes has died");
        }
        terminal.showMessage("*****************************************************");
    }

    public abstract void particularMove(Character enemy);

}
