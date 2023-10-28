import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    /**
     * Nah disini adalah cara menghitung untuk mengetahui volume kubus
     * @param args
     */

      public static void main (String[]args){
      Scanner input =new Scanner(in);

      out.print("Masukkan panjang sisi kubus: ");
      double sisi = input.nextDouble();
          /**
           * nah disini untuk menginput berapa sisi kubus yang kita ingin kan
           */
          
      // Menghitung volume kubus
      double volume = sisi * sisi * sisi;
          /**
           * @param value nah disiini adalah rumus untuk mengetahui volume kubus yang akan diselesaikan pada program ini
           */

      // Menampilkan hasil
        out.println("Volume kubus dengan panjang sisi " + sisi + " adalah " + volume);
          /**
           * nah setelah ini akan keluar output yang telah kita selesaikan rumusnya
           */

      // Menutup objek Scanner
        input.close();
  }
}