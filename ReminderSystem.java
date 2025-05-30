import java.util.*;

public class ReminderSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IObatMGR obatMgr = new ObatMGR();
    private static final IPengingatMGR pengingatMgr = new PengingatMGR(obatMgr);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Tambah Obat");
                System.out.println("2. Lihat Jadwal Obat Hari Ini");
                System.out.println("3. Lihat Semua Obat");
                System.out.println("4. Hapus Obat");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");

                int pilihan = Integer.parseInt(scanner.nextLine().trim());

                switch (pilihan) {
                    case 1:
                        tambahObat();
                        break;
                    case 2:
                        lihatJadwal();
                        break;
                    case 3:
                        lihatSemua();
                        break;
                    case 4:
                        hapusObat();
                        break;
                    case 5:
                        System.out.println("Keluar dari program.");
                        return;
                    default:
                        System.out.println("Menu tidak tersedia.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harus berupa angka.");
            }
        }
    }

    private static void tambahObat() {
        System.out.print("Nama obat: ");
        String nama = scanner.nextLine().trim();
        if (nama.isEmpty()) {
            System.out.println("Nama obat tidak boleh kosong.");
            return;
        }

        System.out.print("Dosis: ");
        String dosis = scanner.nextLine().trim();
        if (dosis.isEmpty()) {
            System.out.println("Dosis tidak boleh kosong.");
            return;
        }

        System.out.print("Waktu konsumsi (pisahkan dengan koma, format HH:mm): ");
        String[] waktuInput = scanner.nextLine().split(",");
        List<String> waktuValid = new ArrayList<>();
        for (String w : waktuInput) {
            String trimmed = w.trim();
            if (trimmed.matches("\\d{2}:\\d{2}")) {
                waktuValid.add(trimmed);
            } else {
                System.out.println("Format waktu salah: " + trimmed + " (Gunakan format HH:mm)");
                return;
            }
        }

        Obat obat = new Obat(nama, dosis, waktuValid.toArray(new String[0]));
        obatMgr.tambahObat(obat);
        System.out.println("Obat berhasil ditambahkan.");
    }

    private static void lihatJadwal() {
        System.out.print("Masukkan waktu (HH:mm): ");
        String waktu = scanner.nextLine().trim();
        if (!waktu.matches("\\d{2}:\\d{2}")) {
            System.out.println("Format waktu tidak valid. Gunakan HH:mm.");
            return;
        }

        List<Obat> daftar = pengingatMgr.getObatUntukWaktu(waktu);
        if (daftar.isEmpty()) {
            System.out.println("Tidak ada obat pada waktu tersebut.");
        } else {
            System.out.println("Obat yang harus diminum pada " + waktu + ":");
            for (Obat o : daftar) {
                System.out.println(o);
            }
        }
    }

    private static void lihatSemua() {
        List<Obat> daftar = obatMgr.getSemuaObat();
        if (daftar.isEmpty()) {
            System.out.println("Belum ada obat yang ditambahkan.");
        } else {
            for (Obat o : daftar) {
                System.out.println(o);
            }
        }
    }

    private static void hapusObat() {
        System.out.print("Nama obat yang akan dihapus: ");
        String nama = scanner.nextLine().trim();
        if (obatMgr.hapusObat(nama)) {
            System.out.println("Obat berhasil dihapus.");
        } else {
            System.out.println("Obat dengan nama tersebut tidak ditemukan.");
        }
    }
}
