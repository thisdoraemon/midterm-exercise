package latihan_uts.App;

import latihan_uts.Data.*;

public class soal3a {
    public static void main(String[] args) {
        System.out.println("POLYMORPHISM\n");

        AnimePolymorphism aot_polymorphism = new AOT_Polymorphism();
        System.out.println("Cerita Attack On Titan: " + aot_polymorphism.Cerita());
        System.out.println("Player Attack on Titan: " + aot_polymorphism.Player());
        System.out.println("Enemy Attack on Titan: " + aot_polymorphism.Enemy());

        AnimePolymorphism hunterxHunter_polymorphism = new HunterxHunter_Polymorphism();
        System.out.println("\nCerita Hunter x Hunter: " + hunterxHunter_polymorphism.Cerita());
        System.out.println("Player Hunter x Hunter: " + hunterxHunter_polymorphism.Player());
        System.out.println("Enemy Hunter x Hunter: " + hunterxHunter_polymorphism.Enemy());

        AnimePolymorphism bungoStrayDogs_polymorphism = new BungoStrayDogs_Polymorphism();
        System.out.println("\nCerita Bungo Stray Dogs: " + bungoStrayDogs_polymorphism.Cerita());
        System.out.println("Player Bungo Stray Dogs: " + bungoStrayDogs_polymorphism.Player());
        System.out.println("Enemy Bungo Stray Dogs: " + bungoStrayDogs_polymorphism.Enemy());
    }
}
