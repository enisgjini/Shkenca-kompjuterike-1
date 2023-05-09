import java.util.Scanner;
 public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numWords = 0;
        while (numWords < 10) {
            System.out.print("Shtypni numrin e fjaleve/fjalive: ");
            numWords = sc.nextInt();
        }
        String[] words = new String[numWords];
        for (int i = 0; i < numWords; i++) {
            System.out.print("Shtypni fjalen/fjaline: ");
            words[i] = sc.next();
        }
        int numWordsAE = 0;
        int lengthWordsAE = 0;
        for (String word : words) {
            int length = findWord(word, 'A', 'E');
            if (length > 0) {
                numWordsAE++;
                lengthWordsAE += length;
            }
        }
        if (numWordsAE == 0) {
            System.out.println("Nuk ka fjale/fjali qe fillon me A dhe mbaron me E.");
        } else {
            double avgLength = lengthWordsAE / (double) numWordsAE;
            System.out.println("Jane shtypur gjithsej " + numWords + " fjale/fjali dhe gjatesia mesatare e atyre qe fillojne me shkronjen A dhe mbarojne me E: " + avgLength);
        }
    }
     public static int findWord(String word, char startChar, char endChar) {
        int length = 0;
        if (word.length() > 0 && Character.toUpperCase(word.charAt(0)) == Character.toUpperCase(startChar)
                && Character.toUpperCase(word.charAt(word.length() - 1)) == Character.toUpperCase(endChar)) {
            length = word.length();
        }
        return length;
    }
}