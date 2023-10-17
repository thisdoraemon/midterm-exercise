package latihan_uts.Data;

public class Penonton {
    private String nama;
    private String nim;
    private int umur;

    public Penonton(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getUmur() {
        return umur;
    }

    @Override
    public String toString() {
        return nama + " " + nim + " umur " + umur + " tahun";
    }
}
