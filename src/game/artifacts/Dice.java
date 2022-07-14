package game.artifacts;

public class Dice {

    public int turnDice(int firstValue, int lastValue){
        return (int) (Math.floor(Math.random() * lastValue + 1)) - 1;
    }

    //Verifica cual de los dos lados tiene mayor valor
    public int verifyTwoDices(int valueDice1, int valueDice2){
        if(valueDice1 > valueDice2) return valueDice1;
        return valueDice2;
    }

}
