import java.util.Scanner;

public class modifikasiSiakad109 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah siswa: ");
    int jumlahSiswa = sc.nextInt();
        
    System.out.print("Masukkan jumlah mata kuliah: ");
    int jumlahMatkul = sc.nextInt();
    int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // Input nilai dan hitung rata-rata per siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            double totalPerSiswa = 0;
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jumlahMatkul);
        }

        System.out.println("\n=========================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        // Hitung rata-rata nilai per mata kuliah
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) { 
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }

    }
}
