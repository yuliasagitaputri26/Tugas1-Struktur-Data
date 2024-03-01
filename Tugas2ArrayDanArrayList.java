package TugasStrukturData;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class tugas2 {

    public static void main(String[] args) {
        //Array 1D
        int a[] = {1, 2, 3, 4, 5};
        float b[] = {1.2f, 2.1f, 3.5f};
        double c[] = {1.5, 6.3, 7.2};
        char d[] = {'A', 'B', 'C'};
        byte e[] = {6, 7, 8, 9, 10};
        short f[] = {10, 20, 30, 40, 50};
        boolean g[] = {true, false, true, false};
        long h[] = {11L, 12L, 13L, 14L, 15L};

        //5 Metode mencetak Array
        System.out.println("no 2");
        int n[] = {1, 2, 3, 4, 5};
        System.out.println("kelas Array-------");
        System.out.println(Arrays.toString(n));
        //menggunakan for
        System.out.println("For----------");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);

        }
        //menggunakan while
        System.out.println("while----------");
        int i = 0;
        while (i < n.length) {
            System.out.println(n[i]);
            i++;
        }
        //menggunakan indeks
        System.out.println("indeks-----");
        System.out.println(n[0]);
        System.out.println(n[1]);

        //menggunakan for each
        System.out.println("for each------");
        for (int num : n) {
            System.out.println(num);
        }

        System.out.println("no 3");
        Scanner yu = new Scanner(System.in);
        int data[][] = new int[2][3];
        for (int j = 0; j < data.length; j++) {
            for (int k = 0; k < data[j].length; k++) {
                data[j][k] = yu.nextInt();

            }

        }
        System.out.println("data Array 2D : " + Arrays.deepToString(data));

        // no 4 membuat ArrayList dengan tipe data wrapper
        ArrayList<Short> genap = new ArrayList<>();
        genap.add(Short.valueOf((short) 2));
        genap.add(Short.valueOf((short) 4));
        genap.add(Short.valueOf((short) 6));
        genap.add(Short.valueOf((short) 8));
        genap.add(Short.valueOf((short) 10));

        System.out.println("\ndata ArrayList : " + genap);

        //no 5 membuat ArrayList tipe data Integer
        ArrayList<Integer> ArrayInteger = new ArrayList<>();
        System.out.println("\nmenambahkan nilai");
        ArrayInteger.add(10);
        ArrayInteger.add(20);
        ArrayInteger.add(30);
        ArrayInteger.add(40);
        ArrayInteger.add(50);

        System.out.println("Data ArrayList : " + ArrayInteger);
        System.out.println("Mengganti nilai : " + ArrayInteger.set(3, 20));
        System.out.println("Mengakses nilai pada indeks ke 2 : " + ArrayInteger.get(2));
        System.out.println("Menghapus nilai : " + ArrayInteger.remove(1));
        System.out.println("size : " + ArrayInteger.size());

    }

}
