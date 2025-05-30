import java.util.List;

public interface IObatMGR {
    void tambahObat(Obat o);
    List<Obat> getSemuaObat();
    boolean hapusObat(String nama); // pastikan mengembalikan boolean
}
