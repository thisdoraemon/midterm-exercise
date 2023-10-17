package latihan_uts.App;

import latihan_uts.Data.BentukGeometri;
import latihan_uts.Data.Bola;
import latihan_uts.Data.Kerucut;
import latihan_uts.Data.Tabung;

public class soal2 {
    public static void main(String[] args) {
        double jariJariLingkaran = 5.0;
        double tinggiKerucut = 10.0;
        double jariJariTabung = 4.0;
        double tinggiTabung = 8.0;
        double jariJariBola = 6.0;

        BentukGeometri bentuk = new BentukGeometri();
        Kerucut kerucut = new Kerucut();
        Tabung tabung = new Tabung();
        Bola bola = new Bola();

        // Menghitung dan mencetak hasil
        System.out.println("Luas Lingkaran: " + bentuk.HitungLuasLingkaran(jariJariLingkaran));
        System.out.println("Keliling Lingkaran: " + bentuk.HitungKelilingLingkaran(jariJariLingkaran));
        System.out.println("Volume Kerucut: " + kerucut.HitungVolumeKerucut(jariJariLingkaran, tinggiKerucut));
        System.out.println("Luas Kerucut: " + kerucut.HitungLuasKerucut(jariJariLingkaran, Math.sqrt(jariJariLingkaran * jariJariLingkaran + tinggiKerucut * tinggiKerucut)));
        System.out.println("Volume Tabung: " + tabung.hitungVolumeTabung(jariJariTabung, tinggiTabung));
        System.out.println("Luas Tabung: " + tabung.hitungLuasTabung(jariJariTabung, tinggiTabung));
        System.out.println("Volume Bola: " + bola.hitungVolumeBola(jariJariBola));
    }
}
