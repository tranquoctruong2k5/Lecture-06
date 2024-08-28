package buổi_6;

import java.util.Arrays;

public class Array_return_call {

    public static void main(String[] args) {
        int[] iq = {126, 84, 149, 167, 95};
        int[] stuttered = stutter(iq);
        System.out.println(Arrays.toString(stuttered));
    }

    public static int[] stutter(int[] array) {
        int[] result = new int[array.length * 2];
        int index = 0;
        for (int i = 0; i < array.length; i++) {

            result[index] = array[i];
            result[index + 1] = array[i];
            index += 2;
        }

        return result;
    }
}
