package latihan_uts.Data;

public class AOT_Interface implements AnimeInterface {
    @Override
    public String getCerita() {
        return "Bercerita tentang balas dendam sejarah TITAN";
    }

    @Override
    public String getPlayer() {
        return "Eren, Armi, Mikasa";
    }

    @Override
    public String getEnemy() {
        return "Ymir, Marley";
    }
}
