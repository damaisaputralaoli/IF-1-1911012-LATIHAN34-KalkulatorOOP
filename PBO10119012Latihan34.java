
package pbo10119012latihan34;
import java.util.Scanner;

/**
 *
 * @author damai
 * NAMA   : DAMAI SAPUTRA LAOLI
 * KELAS  : IF-1
 * NIM    : 10119012
 */
public class PBO10119012Latihan34 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator penghitung = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        penghitung.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        penghitung.value2 = scanner.nextDouble();
        System.out.println();
        System.out.printf("Hasil Pertambahan\t: %.1f%n",penghitung.addValue());
        System.out.printf("Hasil Pengurangan\t: %.1f%n",penghitung.subValue());
        System.out.printf("Hasil Perkalian\t\t: %.1f%n",penghitung.multiplyValue());
        System.out.printf("Hasil Pembagian\t\t: %.1f%n",penghitung.divideValue());
        System.out.printf("Hasil Sisa\t\t\t: %.1f%n",penghitung.divValue());
    }
}