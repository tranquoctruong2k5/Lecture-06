package buổi_6;
import java.util.Arrays;
public class Arrayspassbyreference {
     public static void main(String[] args) {
        int[] iq = {126, 167, 95}; 
        in(iq); 
        System.out.println(Arrays.toString(iq)); 
    }
    public static void in(int[] a) {
        for (int i = 0; i < a.length; i++) {  
            a[i] = a[i] * 2;  
        }
    }
}
