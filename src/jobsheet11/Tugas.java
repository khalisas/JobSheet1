package jobsheet11;
import java.util.Scanner;
public class Tugas {

    private static void Usia(int usia) {
        System.out.println("usia : " + usia + "tahun");
    }
    private static void Absen(int absen) {
        System.out.println("absen: " + absen);
    }
    private static void Alamat(String alamat) {
        System.out.println("alamat :" + alamat);
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Khalisa Shiva Cantika/X RPL7/16");
        System.out.println("");
        System.out.println("masukkan usia anda: ");
        int usia = keyboard.nextInt();
        Usia(usia);
        System.out.println("===================");
        System.out.println("masukkan absen anda: ");
        int absen = keyboard.nextInt();
        Absen(absen);
        System.out.println("===================");
        System.out.println("masukkan alamat anda: ");
        String alamat = keyboard.next();
        Alamat(alamat);
    }
}
