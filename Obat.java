
public class Obat {
    private String nama;
    private String dosis;
    private String[] waktuKonsumsi;

    public Obat(String nama, String dosis, String[] waktuKonsumsi) {
        this.nama = nama;
        this.dosis = dosis;
        this.waktuKonsumsi = waktuKonsumsi;
    }

    public String getNama() {
        return nama;
    }

    public String getDosis() {
        return dosis;
    }

    public String[] getWaktuKonsumsi() {
        return waktuKonsumsi;
    }

    public String toString() {
        return "Obat: " + nama + ", Dosis: " + dosis + ", Waktu: " + String.join(", ", waktuKonsumsi);
    }
}
