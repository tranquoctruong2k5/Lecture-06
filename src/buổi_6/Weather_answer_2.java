
package buổi_6;

import java.util.Scanner;

public class Weather_answer_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Nhập số ngày cần theo dõi nhiệt độ? ");
        int days = console.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.print(+ (i + 1) + "'Nhiệt độ cao của ngày: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;

        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }

        System.out.printf("Nhiệt độ trung bình = %.1f\n", average);
        System.out.println(count + " ngày có nhiệt độ cao hơn trung bình");
        System.out.println("Nhiệt độ: " + java.util.Arrays.toString(temps));
        java.util.Arrays.sort(temps);
        System.out.println("Hai ngày lạnh nhất: " + temps[0] + ", " + temps[1]);
        System.out.println("Hai ngày nóng nhất: " + temps[temps.length - 1] + ", " + temps[temps.length - 2]);
    }
}
