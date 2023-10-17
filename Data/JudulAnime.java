package latihan_uts.Data;

public class JudulAnime {
    private String judulAnime;
    private Penonton penonton;
    private Tokoh_Anime anime;
    private int tahunTerbit;

    public JudulAnime(String judulAnime, Tokoh_Anime anime, Penonton penonton, int tahunTerbit) {
        this.judulAnime = judulAnime;
        this.anime = anime;
        this.penonton = penonton;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "JUDUL '" + judulAnime + "' tokoh anime " + anime + " tahun " + tahunTerbit + " Identitas Penonton " + penonton;
    }
}