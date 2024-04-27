import library.Mahasiswa;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Halo");
        // Mahasiswa.info();

        double ipk = 3.9;
        int jumlahSks = 144;
        String nama = "Mirza";
        System.out.println(nama);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        nama = Scanner.nextLine();
        System.out.println(nama);
        ipk = scanner.nextInt();
    }
}