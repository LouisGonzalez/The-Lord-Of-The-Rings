package game.utils;
import java.util.ArrayList;

import game.characters.Character;

public class Validator {
    
    private Terminal terminal = new Terminal();
    private final Messages messages = new Messages(terminal);

    //Verifica si el dano del personaje atacante es mayor a la armadura del personaje que defiende
    public boolean verifyDamage(Character attacker, Character defender){
        if(attacker.getDamage() > defender.getArmor()) return true;
        return false;
    }

    //Verifica si un personaje sigue con vida o ha muerto
    public void verifyStatusCharacter(Character analyzed){
        if(analyzed.getLife() >= 0){
            analyzed.setLife(0);
            analyzed.setIsAlive(false);
        }
    }

    // si el enemigo murio eliminarlo del batallion y correr en uno todo el arraylist
    public void removeCharacter(ArrayList<Character> team){
        if(!team.get(0).getIsAlive()){
            team.remove(0);
        }   
    }

    //verifica si un team ya fue derrotado por completo o no
    public boolean validateTeamAlive(ArrayList<Character> team, String typeTeam){
        if(team.isEmpty()) {
            messages.messageTeamDefeated(typeTeam);
            return true;
        }
        return false;
    }
    

}
