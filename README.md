# Muhammad-Azmi-Khairy-2310010349-UTS
UTS-Aplikasi Resep Makanan
<img width="775" height="854" alt="Screenshot 2025-11-16 173812" src="https://github.com/user-attachments/assets/e86e3054-e55b-426d-be43-c08f329e6a97" />


1. Deskripsi Proyek

Aplikasi ResepMakananApp adalah aplikasi berbasis Java Swing yang memungkinkan pengguna untuk memasukkan, mengubah, dan menghapus resep makanan atau minuman. Aplikasi ini menggunakan JList untuk menampilkan nama resep, JTable untuk menampilkan nama resep dan detail resep, serta JComboBox untuk memilih jenis resep (makanan atau minuman).

2. Struktur Proyek
ResepMakananApp/
├── src/
│   ├── model/
│   │   └── Model.java
│   ├── ResepForm.java
├── README.md
└── .gitignore


src/model/Model.java: Menangani logika untuk menambah, menghapus, dan mengubah data yang akan ditampilkan di JList dan JTable.

ResepForm.java: GUI untuk aplikasi, mengatur tampilan dan interaksi pengguna.

3. Langkah 1: Membuat Proyek Baru di NetBeans

Buka NetBeans.

Pilih File > New Project.

Pilih Java > Java Application.

Beri nama proyek ResepMakananApp.

Klik Finish.

4. Langkah 2: Membuat Package model dan Class Model.java

Buat package baru di dalam proyek dengan nama model.

Di dalam model, buat class baru Model.java untuk mengelola data resep yang ditampilkan di JList dan JTable.

5. Langkah 3: Membuat Form ResepForm.java

Buat JFrame Form dengan nama ResepForm.

Tambahkan komponen JTextField, JTextArea, JComboBox, JList, JTable, dan tombol-tombol untuk Tambah, Ubah, Hapus, Export, dan Import resep.

6. Menambahkan Data Contoh untuk Uji Coba

Masukkan beberapa resep contoh untuk menguji aplikasi Anda, seperti yang telah saya berikan sebelumnya (misalnya, Ayam Geprek, Nasi Goreng Spesial, dll.).
