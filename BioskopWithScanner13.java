import java.util.Scanner;

public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        int pilihan;
        do {
            System.out.println("Menu:\n1. Input\n2. Tampilkan\n3. Keluar");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("Baris (1-4): ");
                int baris = sc.nextInt() - 1;
                System.out.print("Kolom (1-2): ");
                int kolom = sc.nextInt() - 1;
                sc.nextLine();

                if (baris < 0 || baris >= penonton.length || kolom < 0 || kolom >= penonton[0].length) {
                    System.out.println("Nomor baris atau kolom tidak valid. Silakan masukkan angka antara 1 dan jumlah kursi yang tersedia.");
                } else if (penonton[baris][kolom] != null) {
                    System.out.println("Kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                } else {
                    penonton[baris][kolom] = nama;
                    System.out.println("Pemesanan berhasil!");
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar Penonton:");
                for (String[] barisPenonton : penonton) {
                    for (String penontonNama : barisPenonton) {
                        if (penontonNama == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penontonNama + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }
}