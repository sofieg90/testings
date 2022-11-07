package pack;

import java.awt.*;

public class StoppClass {

    private int charCount;
    private int rowCount;

    private int wordCount;

    private String longestWord;

    private boolean check;

    public StoppClass() {
        charCount = 0;
        rowCount = 0;
        longestWord = "";
        check = true;
        wordCount = 0;

    }

    public int getCharCount() {
        return charCount;
    }

    public int getRowCount() {
        return rowCount;

    }

    public void setText(String input) {

        if (input.equals("stop")) {
            check = false;
        } else {
            rowCount++;
            charCount = charCount + input.length();
            String[] word = input.split(" ");
            wordCount = wordCount + word.length;

            for (int i = 0; i < word.length; i++) {
                if (word[i].length() >= longestWord.length())
                    longestWord = word[i];
            }
        }

    }


    public boolean running() {
        return check;
    }


    public String getLongestWord() {
        return longestWord;
    }

    public int getWords() {
        return wordCount;
    }
}


