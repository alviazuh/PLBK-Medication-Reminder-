# PLBK-Medication-Reminder

## Medication Reminder System

**Medication Reminder System** adalah aplikasi berbasis Java yang dirancang untuk membantu pengguna mengatur dan menerima pengingat konsumsi obat secara tepat waktu.

---

## Pembuat Project

| Nama        | NPM             |
|-------------|------------------|
| Alvia Zuhra | 2208107010003    |

---

## Fitur

### ✅ Penambahan Obat
- Input nama obat, dosis, dan waktu konsumsi
- Validasi input agar sesuai dengan format

### 🕒 Pengingat Jadwal Obat
- Menampilkan daftar obat yang harus diminum berdasarkan waktu saat ini

### 📋 Daftar Obat
- Melihat semua obat yang sudah dimasukkan
- Menampilkan detail dosis dan waktu konsumsi

### ❌ Penghapusan Obat
- Menghapus obat dari daftar pengingat
- Validasi eksistensi data obat

---

## Struktur Proyek
```
Medication-Reminder-System/
├── src/
│   ├── Obat.java             # Class entitas obat
│   ├── IObatMGR.java         # Interface manajemen obat
│   ├── ObatMGR.java          # Implementasi manajemen obat
│   ├── IPengingatMGR.java    # Interface manajemen pengingat
│   ├── PengingatMGR.java     # Implementasi pengingat obat
│   └── ReminderSystem.java   # Main class sistem pengingat obat
└── README.md
```

---

## 💻 Cara Menjalankan

1. Pastikan **Java Development Kit (JDK)** sudah terinstal di perangkat Anda.
2. Buka terminal dan arahkan ke direktori `src/`.
3. Kompilasi semua file `.java` dengan perintah:
   ```
   javac *.java
   ``` 
4. Jalankan program:
   ```
   java ReminderSystem
   ```


---

## 🧠 Penggunaan

Setelah program dijalankan, pengguna dapat memilih menu:

- **Tambah Obat**: Masukkan nama, dosis, dan waktu konsumsi
- **Lihat Jadwal Obat Hari Ini**: Tampilkan obat berdasarkan waktu konsumsi hari ini
- **Lihat Semua Obat**: Menampilkan seluruh daftar obat aktif
- **Hapus Obat**: Menghapus obat berdasarkan nama
- **Keluar**: Menghentikan program

---

## 🧪 Data Demo

|  Nama Obat     | Dosis   | Waktu Konsumsi         |
|----------------|---------|------------------------|
| Paracetamol    | 500mg   | 08:00, 20:00           |
| Amoxicillin    | 250mg   | 07:00, 13:00, 19:00    |
| Vitamin C      | 1000mg  | 09:00                  |

---

## ✅ Validasi

- Nama dan dosis tidak boleh kosong
- Waktu konsumsi harus sesuai format `HH:mm`
- Obat hanya bisa dihapus jika sudah terdaftar
- Tidak boleh ada duplikasi nama obat

---

## 📌 Status Obat

- **Aktif**: Obat masih dikonsumsi sesuai jadwal
- **Selesai**: Obat sudah tidak dikonsumsi (dihapus)

---

## 🚀 Pengembangan Lanjutan

- Integrasi dengan sistem notifikasi desktop atau ponsel
- Penyimpanan data dengan file/database
- Fitur login pengguna
- Riwayat konsumsi obat

---

## 📏 Object Constraint Language (OCL)

Sistem ini menerapkan OCL untuk memastikan integritas data:

- Waktu harus dalam format valid (`HH:mm`)
- Dosis tidak boleh negatif
- Nama obat tidak boleh kosong
- Tidak ada nama obat yang duplikat


