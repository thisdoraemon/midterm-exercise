package latihan_uts.Data;

public class Tokoh_Anime {
    private String nama;
    private String spesialisasi;
    private char gender;

    public Tokoh_Anime(String nama, String spesialisasi, char gender) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return nama + " (" + gender + ") " + spesialisasi;
    }
}
