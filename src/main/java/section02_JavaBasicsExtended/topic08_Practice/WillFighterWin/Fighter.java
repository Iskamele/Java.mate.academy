package section02_JavaBasicsExtended.topic08_Practice.WillFighterWin;

public class Fighter {
    private int health;
    private int damagePerHit;

    public void setHealth(int health){
        this.health = health;
    }

    public void setDamagePerHit(int damagePerHit){
        this.damagePerHit = damagePerHit;
    }

    public int getHealth(){return health;}

    public int getDamagePerHit(){return damagePerHit;}
}
