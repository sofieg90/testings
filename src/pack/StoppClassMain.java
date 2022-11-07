package pack;

import java.util.Scanner;

public class StoppClassMain {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        StoppClass sc = new StoppClass();
        String word;

        System.out.println("Skriv vad du vill:");
        while (true) {
            word = scan.nextLine();

            if (word.equals("stop")) {
                System.out.println("Du skrev stop!");
                break;

            } else {
                sc.setText(word);
            }
        }

        System.out.println("Du skrev: " + sc.getCharCount() + " antal tecken och " + sc.getRowCount() + " antal rader!");
        System.out.println("Det längsta ordet är: " + sc.getLongestWord());
        System.out.println("Antal skrivna ord: " + sc.getWords() + " stycken");
    }
}

