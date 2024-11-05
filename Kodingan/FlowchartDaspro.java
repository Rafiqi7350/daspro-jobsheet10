import java.util.Scanner;

public class FlowchartDaspro {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6];
        System.out.println("Masukkan Hasil Survei (1-5) Untuk Setiap Pertanyaan: ");
        for (int i = 0; i < hasilSurvei.length; i++) {
            System.out.println("Responden Ke-" + (i + 1) + ": ");
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                System.out.print("Nilai Untuk Pertanyaan Ke-" + (j + 1) + ": ");
                hasilSurvei[i][j] = sc.nextInt();
            }
        }

        System.out.println("=======================================");
        System.out.println("Rata-Rata Nilai Untuk Setiap Responden:");
        for (int i = 0; i < hasilSurvei.length; i++) {
            double totalResponden = 0;
            for (int j = 0; j < hasilSurvei[j].length; j++) {
                totalResponden += hasilSurvei[i][j];
            }
            System.out.println("Responden Ke-" + (i + 1) +": " + (totalResponden / hasilSurvei[i].length));
        }

        System.out.println("========================================");
        System.out.println("Rata-Rata Nilai Untuk Setiap Pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += hasilSurvei[i][j];
            }
            System.out.println("Pertanyaan Ke-" + (j + 1) +": " + (totalPertanyaan / 10));
        }

        System.out.println("========================================");
        double totalKeseluruhan = 0;
        for (int i = 0; i < hasilSurvei.length; i++) {
            for (int j = 0; j < hasilSurvei[j].length; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
            double rataRataKeseluruhan = totalKeseluruhan / (hasilSurvei.length * hasilSurvei[0].length);
            System.out.println("Rata-Rata Keseluruhan " + rataRataKeseluruhan);
        }
    }
}
