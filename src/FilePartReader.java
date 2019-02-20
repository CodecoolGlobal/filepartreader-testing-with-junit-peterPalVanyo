package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePartReader {

    //

    public void setup(String filePath, int fromLine, int toLine) {
        System.out.println("hello");
    }

    //opens the file on filePath , and gives back it's content as a String
    //it doesn't catch the exception being raised, if the file isn't present on filePath , so actually the method throws the exception it received

    public String read() throws FileNotFoundException {
        String content = "";
        String fileName = "texts/text.txt";
        File textFile = new File(fileName);

        Scanner input = new Scanner(textFile);
        while(input.hasNextLine()) {
            String line = input.nextLine();
            content += line + "\n";
        }
        return content;
    }

    //reads the file with read ()
    //it gives back every line from it's content between fromLine and toLine (both of them are included),
    // and returns these lines as a String. Take care because if fromLine is 1, it means the very first row in the file.
    // Also, if fromLine is 1 and toLine is 1 also, we will read only the very first line.

    public String readLines() {
        return "something";
    }

}
