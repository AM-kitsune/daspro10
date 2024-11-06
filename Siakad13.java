import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        
        List<List<Integer>> nilai = new ArrayList<>();
        for (int i = 0; i < jumlahSiswa; i++) {
            List<Integer> nilaiSiswa = new ArrayList<>();
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + " siswa " + (i + 1) + ": ");
                nilaiSiswa.add(sc.nextInt());
            }
            nilai.add(nilaiSiswa);
        }

        
        for (int i = 0; i < nilai.size(); i++) {
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai.get(i).size(); j++) {
                totalPerSiswa += nilai.get(i).get(j);
            }
            System.out.println("Rata-rata nilai siswa " + (i + 1) + ": " + totalPerSiswa / jumlahMatkul);
        }

        
        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.size(); i++) {
                totalPerMatkul += nilai.get(i).get(j);
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }
    }
}