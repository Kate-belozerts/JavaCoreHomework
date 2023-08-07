package hw5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Game {
    public static void save() throws IOException {
        int[] ar2 = {0, 1, 2, 3, 0, 1, 2, 3, 0};

        FileOutputStream fos = new FileOutputStream("save1.out");
        for (int b = 0; b < 3; b++) { // write to 3 bytes
            byte wr = 0;
            for (int v = 0; v < 3; v++) { // write by 3 values in each
                wr += (byte) (ar2[3 * b + v] << (v * 2));
            }
            fos.write(wr);
        }

        fos.flush();
        fos.close();
    }

    public static void load() throws IOException {
        int[] ar20 = new int[9];

        FileInputStream fis = new FileInputStream("save1.out");
        int b;
        int i = 0;
        while ((b = fis.read()) != -1) {
            for (int v = 0; v < 3; ++v) { // 3 values of four possible
                ar20[i++] = b >> (v * 2) & 0x3;
            }
        }
        fis.close();

        System.out.println(Arrays.toString(ar20));
        for (int i1 : ar20) {
            if (i1 == 1) {
                System.out.print("X, ");
            } else if (i1 == 2) {
                System.out.print("O, ");
            } else {
                System.out.print("., ");
            }
        }

    }
}
