package latihan_uts.Data;

public class Tabung extends BentukGeometri {
    public double hitungVolumeTabung(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public double hitungLuasTabung(double jariJari, double tinggi) {
        double luasLingkaran = HitungLuasLingkaran(jariJari);
        double luasSelimut = HitungLuasLingkaran(jariJari) * tinggi;
        return 2 * luasLingkaran + luasSelimut;
    }
}
