package character;
import character.enemy;
import util.poin;

public class player {
    //atribute hp, speed, stamina, posisi (x,y), tinggi
    //lompat, lari, attack, mati, respawn, gelinding
    private int stamina, speed,attack,tinggi;
    public static int hp=100;
    public static int skor =0;
    public static poin posisi;

    public void lari(){
        if((this.stamina = stamina-3)>-1)
        {
            this.posisi.setX(this.posisi.getX() + speed);
            this.stamina = this.stamina-3; 
            System.out.println("Player berlari");
        }
        else{
            System.out.println("Player tidak bisa berlari karena tidak ada stamina");
        }
    }

    public void lompat(){
        if((this.stamina = stamina-1)>-1)
        {
            this.posisi.setY(this.posisi.getY() + 2 /*speed*/);
            this.stamina = this.stamina-1; 
            System.out.println("Player lompat");
        }
        else{
            System.out.println("Player tidak bisa lompat karena tidak ada stamina");
        }
    }

    public void jalan(){
        if((this.stamina = stamina-1)>-1)
        {
            this.posisi.setX(this.posisi.getX() + 1 /*speed*/);
            this.stamina = this.stamina-1; 
            System.out.println("Player berjalan");
        }
        else{
            System.out.println("Player tidak bisa berjalan karena tidak ada stamina");
        }
    }

    public void berhenti(){
        if(this.posisi.getX() == this.posisi.getX()){
        this.stamina=this.stamina+1; 
        System.out.println("Player berhenti");
        }

        else{
            this.stamina=this.stamina;
        }
    }

    public int attack(enemy enemy1){
        System.out.println("Player menyerang enemy");
        if(enemy1.getPosisi().getX()== this.getPosisi().getX() && 
        enemy1.getPosisi().getY()==this.getPosisi().getY()){
            return enemy1.getHp()-this.attack;
        }
        else{  
            return enemy1.getHp();
        }
    }

    public void attack(){
        System.out.println("Player menyerang enemy");
        if(enemy.posisi.getX()== this.getPosisi().getX() && 
        enemy.posisi.getY()==this.getPosisi().getY()){
            enemy.hp-=this.attack;
        }
        //System.out.println(nama + "menyerang");
        //return enemy.getHp();
    }

    /*public void attack(){
        System.out.println("Player menyerang");
        //apakah ada musuh/enemy? kalau ada hp-attack
    }*/

    public void mati(){
        System.out.println("Player Mati, Game Over");
    }

    public void respawn(){
        if(this.getHp()==0)
        {
            this.setHp(this.getHp()+100);
            this.setStamina(this.getStamina()+100);
            System.out.println("Respawn");
        }
        else{
            System.out.println("Tidak bisa respawn");
        }
    }
    public void gelinding(){
        if((this.stamina = stamina-3)>-1)
        {
            this.posisi.setX(this.posisi.getX() + 3 /*speed*/);
            this.stamina = this.stamina-3; 
            System.out.println("Player berlari");
        }
        else{
            System.out.println("Player tidak bisa berlari karena tidak ada stamina");
        }
        lari();
        this.setTinggi(this.getTinggi()-3);
        //tinggi-=3;
        System.out.println("Player bergelinding");
    }

    public player() {
    }

    public player(int hp, int stamina, int speed, int attack, int tinggi, poin posisi) {
        this.hp = hp;
        this.stamina = stamina;
        this.speed = speed;
        this.attack = attack;
        this.tinggi = tinggi;
        this.posisi = posisi;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public poin getPosisi() {
        return this.posisi;
    }

    public void setPosisi(poin posisi) {
        this.posisi = posisi;
    }

}
