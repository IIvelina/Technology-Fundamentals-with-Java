package Exercise;

import java.util.Scanner;

public class task4_2CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        StringBuilder encryptedSentence = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char current = sentence.charAt(i);
            encryptedSentence.append((char)(current + 3));
        }
        System.out.println(encryptedSentence.toString());
    }
}
