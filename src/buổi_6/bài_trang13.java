package buổi_6;

import java.util.Arrays;

public class bài_trang13 {

    public static void main(String[] args) {

        int[] e = {0, 2, 4, 6, 8};
        e[1] = e[3] + e[4];
        System.out.println("e is " + Arrays.toString(e));
    }
}
