package latihan_uts.App;

import latihan_uts.Data.AOT_Interface;
import latihan_uts.Data.AnimeInterface;
import latihan_uts.Data.BungoStrayDogs_Interface;
import latihan_uts.Data.HunterxHunter_Interface;


public class soal3c {
    public static void main(String[] args) {
        System.out.println("INTERFACE CLASS\n");

        AnimeInterface aot = new AOT_Interface();
        System.out.println("Cerita Attack on Titan: " + aot.getCerita());
        System.out.println("Player Attack on Titan: " + aot.getPlayer());
        System.out.println("Enemy Attack on Titan: " + aot.getEnemy());

        AnimeInterface hunterxhunter = new HunterxHunter_Interface();
        System.out.println("\nCerita Hunter x Hunter: " + hunterxhunter.getCerita());
        System.out.println("Player Hunter x Hunter: " + hunterxhunter.getPlayer());
        System.out.println("Enemy Hunter x Hunter: " + hunterxhunter.getEnemy());

        AnimeInterface bungoStrayDogs = new BungoStrayDogs_Interface();
        System.out.println("\nCerita Bungo Stray Dogs: " + bungoStrayDogs.getCerita());
        System.out.println("Player Bungo Stray Dogs: " + bungoStrayDogs.getPlayer());
        System.out.println("Enemy Bungo Stray Dogs: " + bungoStrayDogs.getEnemy());
    }
}
