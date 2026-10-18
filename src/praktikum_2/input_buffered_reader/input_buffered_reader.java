package praktikum_2.input_buffered_reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class input_buffered_reader {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String nama = "";
        System.out.print("Masukan Nama Lengkap Anda : ");
        
        try {
            nama = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Terjadi Error... Gagal menginputkan data");
        }
        
        System.out.println("Hello " + nama);
    }
}
