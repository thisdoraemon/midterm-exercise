package latihan_uts.App;

import latihan_uts.Data.AOT_Abstract;
import latihan_uts.Data.BungoStrayDogs_Abstract;
import latihan_uts.Data.HunterxHunter_Abstract;

public class soal3b {
    public static void main(String[] args) {
        System.out.println("ABSTRACT CLASS\n");

        AOT_Abstract aot_abstract = new AOT_Abstract();
        System.out.println("Cerita Attack On Titan: " + aot_abstract.getCerita());
        System.out.println("Player Attack on Titan: " + aot_abstract.getPlayer());
        System.out.println("Enemy Attack on Titan: " + aot_abstract.getEnemy());

        HunterxHunter_Abstract hunterxHunter_abstract = new HunterxHunter_Abstract();
        System.out.println("\nCerita Hunter x Hunter: " + hunterxHunter_abstract.getCerita());
        System.out.println("Player Hunter x Hunter: " + hunterxHunter_abstract.getPlayer());
        System.out.println("Enemy Hunter x Hunter: " + hunterxHunter_abstract.getEnemy());

        BungoStrayDogs_Abstract bungoStrayDogs_abstract = new BungoStrayDogs_Abstract();
        System.out.println("\nCerita Bungo Stray Dogs: " + bungoStrayDogs_abstract.getCerita());
        System.out.println("Player Bungo Stray Dogs: " + bungoStrayDogs_abstract.getPlayer());
        System.out.println("Enemy Bungo Stray Dogs: " + bungoStrayDogs_abstract.getEnemy());
    }
}
