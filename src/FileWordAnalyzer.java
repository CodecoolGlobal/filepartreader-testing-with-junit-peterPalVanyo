package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWordAnalyzer {

    FilePartReader fileReader = new FilePartReader();

    public FileWordAnalyzer(FilePartReader fileReader) {
        this.fileReader = fileReader;
    }

    public List getWordsOrderedAlphabetically (String text) {
        text = text.replace("\n", " ");
        List textList = new ArrayList<String>();
        textList = Arrays.asList(text.split(" "));
        return textList;
    }
}
