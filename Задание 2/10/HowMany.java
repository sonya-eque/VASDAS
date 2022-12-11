import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        String words;
        boolean inf = false;
        int k = 0;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the words: >> ");
        words = src.nextLine();
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ' && inf) {
                k++;
                inf = false;
            }
            if (i == words.length() - 1 && words.charAt(i) != ' ') k++;
            if (words.charAt(i) != ' ') inf = true;
        }

        System.out.println("You entered " + k + " words.");
    }
}