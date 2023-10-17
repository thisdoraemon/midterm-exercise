package latihan_uts.App;

import latihan_uts.Data.JudulAnime;
import latihan_uts.Data.Penonton;
import latihan_uts.Data.Tokoh_Anime;

public class soal1 {
    public static void main(String[] args) {
        Penonton christianto = new Penonton("Christianto Gunadi", "16.N1.0007", 23);
        Tokoh_Anime naruto = new Tokoh_Anime("Naruto", "Jurus Rasengan", 'L');
        Tokoh_Anime satoruGojo = new Tokoh_Anime("Satoru Gojo", "Jurus Limitless", 'L');

        JudulAnime judulNaruto = new JudulAnime("Naruto", naruto, christianto, 2011);
        JudulAnime judulJujutsuKaisen = new JudulAnime("Jujutsu Kaisen", satoruGojo, christianto, 2020);

        System.out.println(christianto);
        System.out.println(naruto);
        System.out.println(judulNaruto);
        System.out.println(satoruGojo);
        System.out.println(judulJujutsuKaisen);
    }
}
