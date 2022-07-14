package game.utils;

public class Questions {
 
    private Terminal terminal;

    public Questions(Terminal terminal){
        this.terminal = terminal;
    }

    public boolean askContinueCreateCreatures(){
        terminal.showMessage("1.YES\n2.NO");
        int option = terminal.askNumber("Do you want to create another creature?");
        if(option == 2) return true;
        return false; 
    }

}
