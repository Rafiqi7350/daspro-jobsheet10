import java.util.Scanner;

public class BioskopWithScanner09 {
    
    public static void main(String[] args) {
        
        String [][] penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);
        String nama,next;
        int baris,kolom;

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;
            System.out.print("Input penonton lainya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

    }
}
