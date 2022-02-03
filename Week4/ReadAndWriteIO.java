package week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteIO {

    public void readAndWrite(String readFile, String writeFile){
        // READ
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(readFile))) {
                String fileLine = "";
            try (FileWriter fileWriter = new FileWriter(writeFile)) {
                while ((fileLine = br.readLine()) != null) {
                    int lineLenght = fileLine.length();
                    if (lineLenght < 30 && !fileLine.trim().isEmpty()) {
                        fileWriter.write(fileLine+"\n");
                    }
                    }
                    }
                }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }        
        catch (IOException e) {
            System.out.println("An exception occurred while writing the file!");
        }
    }
}