import java.util.ArrayList;
import java.util.Scanner;
import character.enemy;
import character.player;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<enemy> Enemy = new ArrayList<enemy>();
        ArrayList<player> Player = new ArrayList<player>();
        
        Scanner input = new Scanner(System.in);
        String yn="y";
        do{
            player player1 = new player();
            enemy enemy1 = new enemy(100, 0, 0, null);
            System.out.print("Player Hp: " + player1.getHp());
            System.out.print("\nPlayer Speed: " + player1.getSpeed());
            System.out.print("Player Stamina: " + player1.getStamina());
            System.out.print("\nPlayer Posisi: " + (player1.posisi.getX() + "," + player1.posisi.getY()));
            System.out.print("\nPlayer Tinggi: " + player1.getTinggi());

            System.out.print("\n\nEnemy Hp: " + enemy1.getHp());
            System.out.print("\nEnemy Speed: " + enemy1.getSpeed());
            System.out.print("\nPlayer Tinggi: " + enemy1.getTinggi());
            System.out.print("\nPlayer Posisi: " + (enemy1.posisi.getX() + "," + enemy1.posisi.getY()));
            menuPlayer();

            int pilihan = 0;
            pilihan = input.nextInt();

            if(pilihan==1){//tambah data nasabah
                //player.Lompat
            }

            System.out.print("Apakah anda ingin kembali ke menu utama (y/n): ");
            yn=input.next();

            menuEnemy();

            pilihan = input.nextInt();

            if(pilihan==1){//tambah data nasabah
                //enemy.Lompat
            }

            System.out.print("Apakah anda ingin kembali ke menu utama (y/n): ");
            yn=input.next();

        }while(yn.equalsIgnoreCase("y"));
    }

    public static void menuPlayer(){
        System.out.println("Karen Onggie_21SI1");
        System.out.println("Player:");
        System.out.println("1. Lompat");
        System.out.println("2. Lari");
        System.out.println("3. Attack");
        System.out.println("4. Mati");
        System.out.println("5. Respawn");
        System.out.println("6. Gelinding");
        System.out.print("Masukkan Pilihan Anda: ");
    }

    public static void menuEnemy(){
        System.out.println("Enemy:");
        System.out.println("1. Lompat");
        System.out.println("2. Lari");
        System.out.println("3. Attack");
        System.out.println("4. Mati");
        System.out.println("5. Terkena Sinar Matahari");
        System.out.println("6. Menjerit");
        System.out.print("Masukkan Pilihan Anda: ");
    }
}
