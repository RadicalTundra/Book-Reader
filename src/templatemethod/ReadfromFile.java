package templatemethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadfromFile extends BookReader {

    BufferedReader reader;
    @Override
    void initialize() {
        try {
            // Modify this method to open the file prideprejudice.txt (included with project)
            reader = new BufferedReader(new FileReader("prideprejudice.txt"));
        } catch (FileNotFoundException e) {
            
        }
    }

    @Override
    void startReading() {
        // Modify this method to read lines from the file and print each line to standard output
		try {
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
		} catch (IOException e) {
                    System.out.println("\n==========================");
                    System.out.println("Plese close the input file.");
                    System.out.println("==========================\n\n");
		}
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("The file wasn't Open");
        }
    }
}
