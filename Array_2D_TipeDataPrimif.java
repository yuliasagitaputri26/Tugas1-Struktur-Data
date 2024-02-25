package TugasStrukturData;

import java.util.Arrays;

public class NewClass {

    public static void main(String[] args) {
        System.out.println("integer/========================");
        int[][] a = {
            {10, 20, 30},
            {40, 50, 60},};
        System.out.println(Arrays.deepToString(a));

        System.out.println("char/=======================");
        char[][] b = {
            {'A', 'B', 'C'},
            {'D', 'E', 'F'}
        };
        System.out.println(Arrays.deepToString(b));

        System.out.println("float/=======================");
        float[][] c = {
            {1.1f, 1.2f, 1.3f},
            {2.1f, 4.2f, 5.7f},};
        System.out.println(Arrays.deepToString(c));

        System.out.println("double/=======================");
        double[][] d = {
            {1.0, 1.8, 1.2},
            {2.6, 4.3, 5.9},};
        System.out.println(Arrays.deepToString(d));

        System.out.println("byte/=======================");
        byte[][] e = {
            {11, 12, 13, 14},
            {20, 40, 56, 70},};
        System.out.println(Arrays.deepToString(e));

        System.out.println("long/=======================");
        long[][] f = {
            {11L, 12L, 13L},
            {21L, 42L, 57L},};
        System.out.println(Arrays.deepToString(f));

        System.out.println("short/=======================");
        short[][] g = {
            {10, 20, 30, 40},
            {22, 26, 90, 86},};
        System.out.println(Arrays.deepToString(g));

        System.out.println("boolean/=======================");
        boolean[][] h = {
            {false, true, true},
            {true, false, false},};
        System.out.println(Arrays.deepToString(h));
    }

}
