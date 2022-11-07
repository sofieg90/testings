package pack;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestStopClass {

    @Test

    public void testGetCharCount() {
        StoppClass sc = new StoppClass();

        int expected = 0;
        int actual = sc.getCharCount();

        assertEquals(expected, actual);
    }

    @Test

    public void testGetRowCount() {
        StoppClass sc = new StoppClass();

        int expected = 0;
        int actual = sc.getRowCount();

        assertEquals(expected, actual);
    }

    @Test

    public void testSetRowCount() {
        StoppClass counter = new StoppClass();

        counter.setText("hej på dig");

        int expected = 1;
        int actual = counter.getRowCount();

        assertEquals(expected, actual);
    }

    @Test

    public void testSetRowCount2() {
        StoppClass counter = new StoppClass();

        counter.setText("hej på dig");
        counter.setText("kul jul");

        int expected = 2;
        int actual = counter.getRowCount();

        assertEquals(expected, actual);
    }

    @Test

    public void testSetCharCount() {
        StoppClass charCounter = new StoppClass();

        charCounter.setText("hej");

        int expected = 3;
        int actual = charCounter.getCharCount();

        assertEquals(expected, actual);
    }

    @Test

    public void testSetCharCount2() {
        StoppClass charCounter = new StoppClass();

        charCounter.setText("hej");
        charCounter.setText("hej hej");


        int expected = 10;
        int actual = charCounter.getCharCount();

        assertEquals(expected, actual);
    }

    @Test

    public void testStopWord() {
        StoppClass myStop = new StoppClass();

        myStop.setText("stop");
        boolean expected = false;
        boolean actual = myStop.running();

        assertEquals(expected, actual);
    }

    @Test

    public void testStopWord2() {
        StoppClass myStop = new StoppClass();

        myStop.setText("hejsan");
        boolean expected = true;
        boolean actual = myStop.running();

        assertEquals(expected, actual);
    }

    @Test

    public void testGetLongestWord() {
        StoppClass myLong = new StoppClass();

        myLong.setText("marabou gott");
        myLong.setText("mjau");


        String expected = "marabou";
        String actual = myLong.getLongestWord();

        assertEquals(expected, actual);

    }

    @Test

    public void testCountWords() {
        StoppClass myWords = new StoppClass();

        myWords.setText("okej");

        int expected = 1;
        int actual = myWords.getWords();

        assertEquals(expected, actual);
    }

    @Test

    public void testCountWords2() {
        StoppClass myWords = new StoppClass();

        myWords.setText("okej");
        myWords.setText("hejsan");

        int expected = 2;
        int actual = myWords.getWords();

        assertEquals(expected, actual);
    }

    @Test

    public void testCountWords3() {
        StoppClass myWords = new StoppClass();

        myWords.setText("okej då");
        myWords.setText("hejsan");

        int expected = 3;
        int actual = myWords.getWords();

        assertEquals(expected, actual);
    }


}


