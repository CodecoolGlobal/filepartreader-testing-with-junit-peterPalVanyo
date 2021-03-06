package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePartReader {

    String filePath;
    int fromLine;
    int toLine;

    //it is just the setup
    public void setup(String filePath, int fromLine, int toLine) {
        if(fromLine <= toLine && fromLine > 0) {
            this.filePath = filePath;
            this.fromLine = fromLine;
            this.toLine = toLine;
        } else {
            throw new IllegalArgumentException("The from has to be greater than 0 and less than to");
        }

    }

    //opens the file on filePath , and gives back it's content as a String
    //it doesn't catch the exception being raised, if the file isn't present on filePath , so actually the method throws the exception it received
    public String read() throws FileNotFoundException {
        String content = "";
        String fileName = this.filePath;
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
    public String readLines() throws FileNotFoundException {
        String text = read();
        String[] deconstructed = text.split(System.getProperty("line.separator"));
        String finalText = "";
        for (int i = this.fromLine; i <= this.toLine; i++) {
            finalText += deconstructed[i-1] + "\n";
        }
        return finalText;
    }

}
