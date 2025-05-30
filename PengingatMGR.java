
import java.util.*;

public class PengingatMGR implements IPengingatMGR {
    private IObatMGR obatMgr;

    public PengingatMGR(IObatMGR obatMgr) {
        this.obatMgr = obatMgr;
    }

    public List<Obat> getObatUntukWaktu(String waktu) {
        List<Obat> hasil = new ArrayList<>();
        for (Obat o : obatMgr.getSemuaObat()) {
            for (String w : o.getWaktuKonsumsi()) {
                if (w.equals(waktu)) {
                    hasil.add(o);
                }
            }
        }
        return hasil;
    }
}
