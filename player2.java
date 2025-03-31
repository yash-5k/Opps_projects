import java.text.MessageFormat;

public class player2 extends player1{
    private int health;
    private final boolean armour;

    public player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if(armour){
            this.health-=20;
            if (this.health<=0){
                this.health=0;
            }
            System.out.println(MessageFormat.format("Armour is on. Got hit by gun1. Health is reduced by 20 new Health is {0}", this.health));
        }
        if(!armour){
            this.health-=30;
            if (this.health<=0){
                this.health=0;
            }
            System.out.println(MessageFormat.format("Armour is off. Got hit by gun1. Health is reduced by 30 new Health is {0}", this.health));
        }
        if (this.health==0){
            System.out.println(getHealth()+"is dead");

        }
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health-=40;
            if (this.health<=0){
                this.health=0;
            }
            System.out.println(MessageFormat.format("Armour is on. Got hit by gun2. Health is reduced by 40 new Health is{0}", this.health));
        }
        if(!armour){
            this.health-=50;
            if (this.health<=0){
                this.health=0;
            }
            System.out.println(MessageFormat.format("Armour is off. Got hit by gun2. Health is reduced by 50 new Health is{0}", this.health));
        }
        if (this.health==0){
            System.out.println(getHealth()+"is dead");

        }
    }
}
