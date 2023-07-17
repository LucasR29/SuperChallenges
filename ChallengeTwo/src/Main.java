import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.50, 0.25, 0.10, 0.01};

        ArrayList<Integer> notesUsed = new ArrayList<>();
        ArrayList<Integer> coinsUsed = new ArrayList<>();

        double value = scanner.nextDouble();

        for (int i = 0; i < notes.length; i ++){
            if (value >= notes[i]) {
                 notesUsed.add((int) (value / notes[i]));

                 value %= notes[i];
            } else {
                notesUsed.add(0);
            }
        }

        if(value >= 1) {
            for (int i = 0; i < coins.length; i++) {
                if (value >= coins[i]) {
                    coinsUsed.add((int) (value / coins[i]));

                    value %= coins[i];
                } else {
                    coinsUsed.add(0);
                }
            }
        }

        System.out.println("NOTAS: ");

        for (int i = 0; i < notesUsed.stream().count(); i++) {
            System.out.println(notesUsed.get(i) + " nota(s) de R$ " + (double) notes[i]);
        }

        System.out.println("MOEDAS: ");

        for (int i = 0; i < coinsUsed.stream().count(); i++) {
            System.out.println(coinsUsed.get(i) + " moeda(s) de R$ " + (double) coins[i]);
        }
    }
}