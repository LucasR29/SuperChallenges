import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        int n = scanner.nextInt();
        ArrayList<Integer> pair = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Número %d: ", i +1);
            int value = scanner.nextInt();

            if (value % 2 == 0) {
                pair.add(value);
            } else {
                odds.add(value);
            }
        }

        Collections.sort(pair);
        Collections.sort(odds, Collections.reverseOrder());

        pair.addAll(odds)
;
        for (int i : pair){
            System.out.println(i);
        };
    }
}