package src;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {




        FilePartReader read = new FilePartReader();
        read.setup("texts/text.txt", 1, 1);
        FileWordAnalyzer analyzer = new FileWordAnalyzer(read);

        String content = read.readLines();
        System.out.println(content);

        String firstContent = read.read();
        System.out.println("just read: ");
        System.out.println(firstContent);

        System.out.println(analyzer.getWordsOrderedAlphabetically());
        System.out.println(analyzer.getWordsContainingSubstring("ine"));
        System.out.println(analyzer.getStringsWhichPalindromes());



    }

}
