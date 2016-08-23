import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

import static org.junit.Assert.*;

/**
 * Created by harshita on 23/8/16.
 */
public class WordCounterTest {

    WordCounter wc;
    File file;

    @Before
    public void setUp() throws Exception {
        wc = new WordCounter("input.txt", 2);
        file = new File("input.txt");
    }

    @Test(expected = FileNotFoundException.class)
    public void setFilename1() throws Exception {
        wc.setFilename("xnds");
    }

    @Test
    public void setFilename2() throws Exception {
        wc.setFilename("input2.txt");
    }

     @Test
     public void setFilename3() throws Exception {
         wc.setFilename("out");
     }

    @Test(expected = InputMismatchException.class)
    public void setNumberOfOccurencesOfWords() throws Exception {
        wc.setNumberOfOccurencesOfWords(-2);
    }

    @Test
    public void setNumberOfOccurencesOfWords2() throws Exception {
        wc.setNumberOfOccurencesOfWords(2);
    }

    @Test
    public void findWordsTest() throws Exception {
        assertNotEquals(null, wc.findWords());
    }









































}
