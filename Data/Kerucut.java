package latihan_uts.Data;

public class Kerucut extends BentukGeometri {
    public double HitungVolumeKerucut(double jariJari, double tinggi) {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }

    public double HitungLuasKerucut(double jariJari, double sisiMiring) {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }
}
