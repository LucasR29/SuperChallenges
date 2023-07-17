import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int value = scanner.nextInt();

        int[] arr = new int[size];

        int pairs = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for(int z = (i + 1); z < arr.length; z++) {
                int res = arr[i] - arr[z];

                if(Math.abs(res) == value){
                    pairs++;
                }
            }
        }

        System.out.println(pairs);
    }
}