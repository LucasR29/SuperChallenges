import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String nothing = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String line = scanner.nextLine();
            lines.add(line);
        }

        for(String i : lines) {
            String unscrambled = unscramble(i);

            System.out.println(unscrambled);
        }
    }

    public static String unscramble(String line) {
        int length = line.length();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--){
            stringBuilder.append(line.charAt(i));
        }
        for (int i = length - 1; i >= length / 2; i--) {
            stringBuilder.append(line.charAt(i));
        }

        return stringBuilder.toString();
    }
}