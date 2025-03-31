public class player1 {
    private String name;
    private String weapon;
    private int health;

    public player1(String name,String weapon,int health){
        if (health<0 || health>100){
            this.health=100;
        }else {
            this.health = health;
        }
        this.weapon=weapon;
        this.name=name;
    }

    public void damageByGun1(){
        this.health-=30;
        if(this.health<=0){
            this.health=0;
        }
        System.out.printf("Got hit by gun 1. Health is reduced by 30 New health is %d%n", this.health);
        if (this.health==0){
            System.out.println(getName()+"is dead");
        }

    }

    public void damageByGun2(){
        this.health-=50;
        if(this.health<=0){
            this.health=0;
        }
        System.out.printf("Got hit by gun 1. Health is reduced by 50 New health is%d%n", this.health);
        if (this.health==0){
            System.out.println(getName()+"is dead");
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health=health;

    }

    public void heal() {
        if (this.health <= 0) {
            System.out.println("player is dead");
        } else {
            this.health += 70;
            if (this.health > 100) {
                this.health = 100;
            }
        }
    }
}
