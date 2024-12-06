package soal3;
import java.util.Scanner;
public class no2 {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        // Create array with user-specified size
        int[] array = new int[n];

        // Input elements one by one using a loop
        System.out.println("Masukkan elemen array (pisahkan dengan spasi): ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        cekDuplikat(array);

        scanner.close(); // Close the scanner to avoid resource leaks
    }

    public static void cekDuplikat(int[] array) {
        boolean hasDuplicates = false;

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array memiliki elemen duplikat: " + array[i]);
                    hasDuplicates = true;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
    }
}
    

