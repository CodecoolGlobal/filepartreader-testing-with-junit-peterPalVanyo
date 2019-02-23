package src;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class FilePartReaderTest {

    private static FilePartReader read;
    private static String result;

    @Before
    public void init() throws FileNotFoundException {
        FilePartReader read = new FilePartReader();
        read.setup("texts/text.txt", 1, 1);
        result = read.read();
    }

//    @Rule
//    public ExpectedException thrown= ExpectedException.none();
//
//    @Test
//    public void setup() {
//        thrown.expect(IllegalArgumentException.class);
//        read.setup("texts/text.txt", 3, 1);
//    }

    @Test
    public void read() throws FileNotFoundException {
        String expected = "First line anna\nSecond line\nThird line aha\n";
        assertEquals(expected, result);
    }

    @Test
    public void readLines() {
    }
}