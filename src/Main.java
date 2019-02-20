package src;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {




        FilePartReader read = new FilePartReader();
        read.setup("texts/text.txt", 1, 1);

        String content = read.readLines();
        System.out.println(content);



    }

}
