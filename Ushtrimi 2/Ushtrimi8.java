import java.util.Scanner;

public class Ushtrimi8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        int sentenceCount = 0;
        int firstAndLastLetterCount = 0;

        do {
            System.out.print("Shkruani një fjali (ose shtypni SENTINEL për të mbyllur programin): ");
            sentence = input.nextLine();

            if (!sentence.equals("SENTINEL")) {
                sentenceCount++;

                boolean hasFirstAndLastLetter = false;
                String word = "";
                for (int i = 0; i < sentence.length(); i++) {
                    char c = sentence.charAt(i);
                    if (Character.isLetter(c)) {
                        word += c;
                    } else {
                        if (!word.equals("")) {
                            char firstLetter = word.charAt(0);
                            char lastLetter = word.charAt(word.length() - 1);

                            if (Character.isLetter(firstLetter) && Character.isLetter(lastLetter)) {
                                hasFirstAndLastLetter = true;
                                break;
                            }
                            word = "";
                        }
                    }
                }

                if (hasFirstAndLastLetter) {
                    firstAndLastLetterCount++;
                }
            }
        } while (!sentence.equals("SENTINEL"));

        System.out.println("Numri i fjalive të shtypura është: " + (sentenceCount - 1)); // SentenceCount-1 për të mos
                                                                                         // numëruar SENTINEL
        System.out.println(
                "Numri i fjalive me shkronjën e parë dhe të fundit të njëjtë është: " + firstAndLastLetterCount);
    }
}
