package game.characters;

public abstract class Character {
    
    private String name;
    private int life;
    private int armor;
    private int damage;
    private boolean isAlive = true;

    public Character(String name, int life, int armor){
        this.name = name;
        this.life = life;
        this.armor = armor;
    }

    public abstract void attackTurn(Character enemy);
        
    public String getType(){
        return this.getClass().getSimpleName();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLife(int life){
        this.life = life;
    }

    public int getLife(){
        return this.life;
    }

    public void setArmor(int armor){
        this.armor = armor;
    }

    public int getArmor(){
        return this.armor;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }

    public void setIsAlive(boolean isAlive){
        this.isAlive = isAlive;
    }

    public boolean getIsAlive(){
        return this.isAlive;
    }




    

}
