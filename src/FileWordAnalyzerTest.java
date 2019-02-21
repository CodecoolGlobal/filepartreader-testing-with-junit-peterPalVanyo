package src;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FileWordAnalyzerTest {

    @org.junit.Test
    public void getWordsOrderedAlphabetically() throws FileNotFoundException {
        FilePartReader read = new FilePartReader();
        read.setup("texts/text.txt", 1, 3);
        FileWordAnalyzer analyzer = new FileWordAnalyzer(read);
        List<String> result = analyzer.getWordsOrderedAlphabetically();
        List<String> expected = Arrays.asList("aha", "anna", "First", "line", "line", "line", "Second", "Third");
        assertEquals(expected, result);
    }

    @org.junit.Test
    public void getWordsContainingSubstring() {
    }

    @org.junit.Test
    public void getStringsWhichPalindromes() {
    }

    @Test
    public void justFunny(){
        assertEquals(11,11);
    }
}