package src;

import org.junit.Before;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FileWordAnalyzerTest {

    private FilePartReader read = new FilePartReader();
    private FileWordAnalyzer analyzer = new FileWordAnalyzer(read);


    @Before
    public void setup() {
        read.setup("texts/text.txt", 1, 3);
    }


    @org.junit.Test
    public void getWordsOrderedAlphabetically() throws FileNotFoundException {
        List<String> result = analyzer.getWordsOrderedAlphabetically();
        List<String> expected = Arrays.asList("aha", "anna", "First", "line", "line", "line", "Second", "Third");
        assertEquals(expected, result);
    }

    @org.junit.Test
    public void getWordsContainingSubstring() throws FileNotFoundException {
        List<String> result = analyzer.getWordsContainingSubstring("ine");
        List<String> expected = Arrays.asList("line", "line", "line");
        assertEquals(expected, result);
    }

    @org.junit.Test
    public void getStringsWhichPalindromes() throws FileNotFoundException {
        List<String> result = analyzer.getStringsWhichPalindromes();
        List<String> expected = Arrays.asList("aha", "anna");
        assertEquals(expected, result);
    }

}