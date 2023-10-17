package latihan_uts.Data;

public class BungoStrayDogs_Interface implements AnimeInterface {
    @Override
    public String  getCerita() {
        return  "Kesimbangan detektif, pemerintah, penjahat";
    }

    @Override
    public String getPlayer() {
        return  "Atsushi, Danzai";
    }

    @Override
    public String getEnemy() {
        return "Fyodor, Kamui";
    }
}
