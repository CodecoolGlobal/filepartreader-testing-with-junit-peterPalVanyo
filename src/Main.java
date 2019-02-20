package src;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {




        FilePartReader read = new FilePartReader();

        String content = read.read();
        System.out.println(content);



    }

}
