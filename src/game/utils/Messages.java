package game.utils;

import java.util.ArrayList;

import game.characters.Character;

public class Messages {
    
    private Terminal terminal;

    public Messages(Terminal terminal){
        this.terminal = terminal;
    }
    
    public void presentTeam(ArrayList<Character> team, String titleTeam){
        terminal.showMessage("*****************************************************");
        terminal.showMessage("\n                    This is the " + titleTeam +"            ");
        terminal.showMessage("*****************************************************");
        showDataTeam(team);
        terminal.showMessage("*****************************************************");
    }

    public void presentOpponents(Character myCharacter, Character enemyCharacter){
        terminal.showMessage("*****************************************************");
        terminal.showMessage("                   NEXT BATTLE!                     ");
        terminal.showMessage("*****************************************************");
        terminal.showMessage(myCharacter.getName() + " Life: " + myCharacter.getLife() + " VS " + enemyCharacter.getName()+ " Life: " + myCharacter.getLife());
        terminal.showMessage("*****************************************************");
    }

    public void reportTurn(ArrayList<Character> heroTeam, ArrayList<Character> beastTeam){
        terminal.showMessage("*****************************************************");
        terminal.showMessage("                  STATUS TEAMS                       "); 
        terminal.showMessage("                   Hero Team                       "); 
        showDataTeam(heroTeam);
        terminal.showMessage("-----------------------------------------------------");
        terminal.showMessage("                   Beast Team                       "); 
        showDataTeam(beastTeam);
        terminal.showMessage("*****************************************************");

    }

    public void showDataTeam(ArrayList<Character> team){
        for (Character character : team) {
            terminal.showMessage("Name: " + character.getName() + "; Type: " + character.getType() + "; Life: " + character.getLife() + "; Armor: " + character.getArmor());
        }        
    }

    public void messageTeamDefeated(String team){
        terminal.showMessage("*****************************************************");
        terminal.showMessage("           The " + team + " has been defeated         ");
        terminal.showMessage("*****************************************************");
    }

}
