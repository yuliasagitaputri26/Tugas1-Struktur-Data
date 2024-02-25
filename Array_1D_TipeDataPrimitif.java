package TugasStrukturData;

import java.util.Arrays;

public class NewClass {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        float[] floatArray = {1.1f, 2.1f, 3.2f, 4.2f};
        double[] doubleArray = {2.3, 4.5, 5.2, 7.8};
        boolean[] booleanArray = {true, false, true, false};
        byte[] byteArray = {6, 7, 8, 9, 10};
        long[] longArray = {11L, 12L, 13L, 14L, 15L};
        short[] shortArray = {10, 20, 30, 40, 50};

        System.out.println("int Array : " + Arrays.toString(array));
        System.out.println("char Array : " + Arrays.toString(charArray));
        System.out.println("float Array : " + Arrays.toString(floatArray));
        System.out.println("double Array : " + Arrays.toString(doubleArray));
        System.out.println("boolean Array : " + Arrays.toString(booleanArray));
        System.out.println("byte Array : " + Arrays.toString(byteArray));
        System.out.println("long Array : " + Arrays.toString(longArray));
        System.out.println("short Array : " + Arrays.toString(shortArray));

    }

}
