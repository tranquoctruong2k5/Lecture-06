package buổi_6;

import java.util.Arrays;

public class Arrayparameterquestions {

    public static void main(String[] args) {
        int[] a1 = {12, 34, 56};
        swap(a1, 1, 2);
        System.out.println(Arrays.toString(a1));
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
