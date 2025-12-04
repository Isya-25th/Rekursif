import java.util.Scanner;

public class Tugas {
    static int totalIteratif(Scanner sc, int n) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            total += angka;
        }
        return total;
    }

    static int totalRekursif(Scanner sc, int i) {
        if (i == 0) {
            return 0;
        } else {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            return angka + totalRekursif(sc, i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        System.out.println("\nIteratif: ");
        int hasilIteratif = totalIteratif(sc, n);
        System.out.println("Total dari " + n + " angka adalah: " + hasilIteratif);

        System.out.println("\nMenggunakan Rekursif: ");
        int hasilRekursif = totalRekursif(sc, n);
        System.out.println("Total dari " + n + " angka adalah: " + hasilRekursif);
    }
}
