import java.util.*;

public class ObatMGR implements IObatMGR {
    private final List<Obat> daftarObat = new ArrayList<>();

    @Override
    public void tambahObat(Obat o) {
        daftarObat.add(o);
    }

    @Override
    public List<Obat> getSemuaObat() {
        return new ArrayList<>(daftarObat); // Return copy
    }

    @Override
    public boolean hapusObat(String nama) {
        Iterator<Obat> iterator = daftarObat.iterator();
        while (iterator.hasNext()) {
            Obat o = iterator.next();
            if (o.getNama().equalsIgnoreCase(nama)) {
                iterator.remove();
                return true; // Berhasil dihapus
            }
        }
        return false; // Tidak ditemukan
    }
}
