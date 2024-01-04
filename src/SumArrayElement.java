import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumArrayElement {
    public static void main(String[] args) {
        System.out.println("Array Toplamini ve Reversesini bulan  Programa hosgeldiniz");
        System.out.println("Simdi basliyoruz");
        System.out.println("Simdi basliyoruz");

        int[] sayilar = {2, 4, 6, 8, 10};
        sumAndReverseArray(sayilar);

    }

    public static void sumAndReverseArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);

        List<Integer>list1=new ArrayList<>();
        for (int i = array.length-1; i >= 0; i--) {
list1.add(array[i]);
        }
        System.out.println("Normal Array = "+ Arrays.toString(array));
        System.out.println("Reverse = " + list1);
    }

}
