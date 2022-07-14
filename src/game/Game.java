package game;

import game.characters.Character;
import game.utils.*;
import java.util.ArrayList;

public class Game {
    
    private ArrayList<Character> heroTeam;
    private ArrayList<Character> beastTeam;
    private Creator myCreator;
    private Validator myValidator;
    private boolean gameOver = false;
    private Messages messages;

    public Game(Terminal terminal){
        heroTeam = new ArrayList<>();
        beastTeam = new ArrayList<>();
        myCreator = new Creator(terminal);
        myValidator = new Validator();
        this.messages = new Messages(terminal);
    }

    public void initialize(){
        myCreator.createTeam(heroTeam, 1);
        myCreator.createTeam(beastTeam, 2);
    }


    public void go(){
        initialize();
        messages.presentTeam(heroTeam, "Hero Team");
        messages.presentTeam(beastTeam, "Beast Team");
        do {
            turn(heroTeam, beastTeam, "Hero team");
            if(!gameOver) turn(beastTeam, heroTeam, "Beast team");
        } while(!gameOver);
    }

    public void turn(ArrayList<Character> teamAttack, ArrayList<Character> enemyTeam, String nameTeam){
        messages.presentOpponents(teamAttack.get(0), enemyTeam.get(0));
        teamAttack.get(0).attackTurn(enemyTeam.get(0));
        myValidator.removeCharacter(enemyTeam);
        messages.reportTurn(heroTeam, beastTeam);
        gameOver = myValidator.validateTeamAlive(enemyTeam, nameTeam);
    }


}
