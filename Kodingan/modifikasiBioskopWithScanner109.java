import java.util.Scanner;

public class modifikasiBioskopWithScanner109 {
    
    public static void main(String[] args) {
        
        String [][] penonton = new String[4][2];
        Scanner sc = new Scanner(System.in);
        String nama,next;
        int baris,kolom;

        while (true) {
            System.out.println("-----------Menu-----------");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Data Penonton");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan Nama: ");
                        nama = sc.nextLine();

                        while (true) {
                            System.out.print("Masukkan Baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan Kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Nomor Baris Atau Kolom Tidak Valid, Masukkan Lagi!");
                            } else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi Yang Dipilih Sudah Terisi, Silakan Pilih Lagi!");
                            } else {
                                break;
                            }
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.print("Input Penonton Lainnya? (Y/N): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    break;

                    case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print((penonton[i][j] == null ? "*" : penonton[i][j]) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Keluar Dari Program");
                    return;

                default:
                System.out.println("Pilihan Tidak Valid. Silakan Pilih Menu 1, 2, Atau 3!");
                break;
            }
        }
    }
}
