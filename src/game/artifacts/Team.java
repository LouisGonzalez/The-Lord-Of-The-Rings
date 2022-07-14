package game.artifacts;

import java.util.ArrayList;
import game.characters.Character;

public class Team {
    
    private ArrayList<Character> myTeam;
    private boolean defeated = false;

    public Team(){
        myTeam = new ArrayList<>();
    }

    public ArrayList<Character> getMyTeam(){
        return this.myTeam;
    }

    public void setDefeated(boolean defeated){
        this.defeated = defeated;
    }

    public boolean getDefeated(){
        return this.defeated;
    }


}
