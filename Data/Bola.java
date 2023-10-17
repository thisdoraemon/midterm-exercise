package latihan_uts.Data;

public class Bola extends BentukGeometri {
    public double hitungVolumeBola(double jariJari) {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }
}
