package src;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileWordAnalyzer {

    FilePartReader fileReader = new FilePartReader();

    public FileWordAnalyzer(FilePartReader fileReader) {
        this.fileReader = fileReader;
    }


    public List getWordsOrderedAlphabetically () throws FileNotFoundException {
        String text = fileReader.readLines();
        text = text.replace("\n", " ");
        List<String> textList = new ArrayList<String>();
        textList = Arrays.asList(text.split(" "));
        Collections.sort(textList, String.CASE_INSENSITIVE_ORDER);
        return textList;
    }


    public List getWordsContainingSubstring (String subString ) throws FileNotFoundException {
        List<String> textList = getWordsOrderedAlphabetically();
        List<String> filteredList = new ArrayList<String>();
        for (String s: textList) {
            if(s.contains(subString)) {
                filteredList.add(s);
            }
        }
        return filteredList;
    }

    public List getStringsWhichPalindromes () throws FileNotFoundException {
        List<String> textList = getWordsOrderedAlphabetically();
        List palindromesList = new ArrayList<String>();
        for(String s: textList){
            String sMirror = "";
            for(int i=(s.length()-1); i>=0; i--) {
                sMirror += s.charAt(i);
            }
            if(s.equalsIgnoreCase(sMirror)) {
                palindromesList.add(s);
            }
        }
        return palindromesList;
    }




}
