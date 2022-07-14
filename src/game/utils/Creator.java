package game.utils;

import java.util.ArrayList;

import game.characters.Character;
import game.characters.typeCharacter.typeBeast.Orcs;
import game.characters.typeCharacter.typeBeast.Trasgos;
import game.characters.typeCharacter.typeHeroe.Elve;
import game.characters.typeCharacter.typeHeroe.Hobbit;
import game.characters.typeCharacter.typeHeroe.Human;

public class Creator {
 
    private Terminal terminal;
    private Questions question;

    public Creator(Terminal terminal){
        this.terminal = terminal;
        question = new Questions(terminal);
    }


    public void createTeam(ArrayList<Character> heroTeam, int type){
        boolean continueCreate = true;
        do {
            Character myCreature = createCreature(type);
            if(myCreature != null) heroTeam.add(myCreature);
            continueCreate = question.askContinueCreateCreatures();
        } while(!continueCreate);

    }

    public void showCreatureOptions(int type){
        if(type == 1){
            terminal.showMessage("1. Elve");
            terminal.showMessage("2. Hobbit");
            terminal.showMessage("3. Human");
        } else if(type == 2){
            terminal.showMessage("1. Orc");
            terminal.showMessage("2. Trasgo");
        }
    }

    public Character createCreature(int type){
        String name = terminal.askString("Enter the name of your creature");
        int armor = terminal.askNumber("Enter the armor of your creature");
        showCreatureOptions(type);
        int typeCreature = terminal.askNumber("Select a creature type");
        if(type == 1){
            switch(typeCreature){
                case 1: 
                    return new Elve(name, armor);
                case 2:
                    return new Hobbit(name, armor);
                case 3:
                    return new Human(name, armor);
                default:
                    break;
            }
        } else if(type == 2){
            switch(typeCreature){
                case 1:
                    return new Orcs(name, armor);
                case 2:
                    return new Trasgos(name, armor);
                default:
                    break;
            }
        }
        terminal.showMessage("Invalid creature type");
        return null;
    }

    

    
}
