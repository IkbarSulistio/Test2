import java.util.Scanner;

/**
 * Kelas yang merepresentasikan Rata-rata Pengeluaran.
 */
public class RatarataPengeluaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahPengeluaran = input.nextInt();
        double totalPengeluaran = 0;

        System.out.println("Kalkulator Rata-Rata Pengeluaran\n");
        System.out.print("Berapa hari pengeluaran yang ingin Anda hitung? ");

        if (jumlahPengeluaran <= 0) {
            System.out.println("Tidak ada pengeluaran untuk dihitung.");
            input.close();
            return;
        }

        for (int i = 1; i <= jumlahPengeluaran; i++) {
            System.out.print("Hari ke-" + i + ": ");
            double pengeluaran = input.nextDouble();
            totalPengeluaran += pengeluaran;
        }

        double rataRata = totalPengeluaran / jumlahPengeluaran;
        System.out.println("Rata-rata pengeluaran Anda adalah: " + rataRata);

        input.close();
    }
}
