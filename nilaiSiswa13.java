import java.util.Scanner;

public class nilaiSiswa13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaSiswa;
        double totalNilai = 0;
        int jumlahSiswa = 0;
        int diAtasRataRata = 0;

        while (true) { 
            System.out.print("Masukkan nama siswa (atau ketik 'selesai' untuk mengakhiri): ");
            namaSiswa = input.nextLine();
            if (namaSiswa.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan nilai untuk " + namaSiswa + ": ");
            double inputNilai = input.nextDouble();
            input.nextLine(); 

            totalNilai += inputNilai;
            jumlahSiswa++;

            double rataRata = totalNilai / jumlahSiswa;
            if (inputNilai > rataRata) {
                diAtasRataRata++;
            }
        }

        if (jumlahSiswa == 0) {
            System.out.println("Tidak ada data siswa yang dimasukkan.");
            input.close();
            return;
        }

        double rataRata = totalNilai / jumlahSiswa;
        int diBawahRataRata = jumlahSiswa - diAtasRataRata;

        System.out.printf("\nRata-rata nilai siswa: %.2f%n", rataRata);
        System.out.println("Jumlah siswa di atas rata-rata: " + diAtasRataRata);
        System.out.println("Jumlah siswa di bawah rata-rata: " + diBawahRataRata);

        
        if (diAtasRataRata > (jumlahSiswa / 2)) {
            System.out.println("Kelas ini memiliki mayoritas siswa dengan nilai di atas rata-rata.");
        } else {
            System.out.println("Kelas ini tidak memiliki mayoritas siswa dengan nilai di atas rata-rata.");
        }

        input.close();
    }
}