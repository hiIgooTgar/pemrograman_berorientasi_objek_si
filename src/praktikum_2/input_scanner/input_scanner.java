package praktikum_2.input_scanner;
import java.util.Scanner;

public class input_scanner {
    public static void main(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        
        String nama, prodi, alamat = "";
        System.out.print("Masukkan Nama Lengkap Anda : ");
        nama = dataInput.nextLine();
        System.out.print("Masukkan Program Studi Anda : ");
        prodi = dataInput.nextLine();
        System.out.print("Masukkan Alamat Anda : ");
        alamat = dataInput.nextLine();
        
        System.out.println("\n== Biodata Diri Mahasiswa ==");
        System.out.println("Hello " + nama);
        System.out.println("Dari Program Studi " + prodi);
        System.out.println("Alamat dari " + alamat);
    }
}