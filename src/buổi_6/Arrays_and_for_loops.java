package buổi_6;

public class Arrays_and_for_loops {
      public static void main(String[] args) {
        int a=8;
        int[] numbers = new int[a];
        for (int i = 0; i < a; i++) {
            numbers[i] = 2 * i;
            System.out.print(numbers[i] + " ");
        }

    }
}
