package src;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWordAnalyzer {

    FilePartReader fileReader = new FilePartReader();

    public FileWordAnalyzer(FilePartReader fileReader) {
        this.fileReader = fileReader;
    }

//    public List getWordsOrderedAlphabetically (String text) {
//        text = text.replace("\n", " ");
//        List<String> textList = new ArrayList<String>();
//        textList = Arrays.asList(text.split(" "));
//        return textList;
//    }

    public List getWordsOrderedAlphabetically () throws FileNotFoundException {
        String text = fileReader.readLines();
        text = text.replace("\n", " ");
        List<String> textList = new ArrayList<String>();
        textList = Arrays.asList(text.split(" "));
        return textList;
    }



}
