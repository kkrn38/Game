package character;
import character.player;
import util.poin;

public class enemy {
    //atribute hp, speed, posisi (x,y), tinggi
    //lari, attack, mati, terkena sinar matahari, jerit
    private String nama; //pocong, kunti, tuyul
    private int speed,attack,tinggi;
    public static int hp=100;
    public static poin posisi;
    

    public void lari(){
        posisi.setX(posisi.getX() + speed);
        System.out.println(nama + " berlari");
    }

    public int attack(player player_){
        System.out.println(nama + " menyerang");
        if(player_.getPosisi().getX()== this.getPosisi().getX() && 
        player_.getPosisi().getY()==this.posisi.getY()){
            return player_.getHp()-this.attack;
        }
        else{  
            return player_.getHp();
        }
    }

    public void attack(){
        System.out.println(nama + " menyerang");
        if(player.posisi.getX()== this.getPosisi().getX() && 
        player.posisi.getY()==this.posisi.getY()){
            player.hp-=this.attack;
        }
        //System.out.println(nama + "menyerang");
        //return player_.getHp();
    }
    public void mati(){
        System.out.println(nama + " mati");
        player.skor+=10;
    }
    public void terkenaSinar(){
        System.out.println("Player terkena sinar matahari");
        System.out.println("\nPlayer menjerit kepanasan");
        player.hp-=10;
        
    }
    public void jerit(){   
        System.out.println(nama + " menjerit : aawawawawawawaw");
        player.hp-=10;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public enemy (int hp, int speed, int tinggi, poin posisi) {
        this.hp = hp;
        this.speed = speed;
        this.tinggi = tinggi;
        this.posisi = posisi;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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