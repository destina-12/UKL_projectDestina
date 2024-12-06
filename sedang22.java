package soal2;
import java.util.Scanner;

public class sedang22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phi = 3.14;

        int r, t;
        System.out.print("Masukkan jari-jari: ");
        r = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        double volume = hitungVolumeTabung(r, t, phi);
        System.out.println("Volume tabung anda adalah: " + volume);

        input.close();
    }

    // Fungsi untuk menghitung volume tabung
    public static double hitungVolumeTabung(double r, double t, double phi) {
        return phi * r * r * t;
    }
}

