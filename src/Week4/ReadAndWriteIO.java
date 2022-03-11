package week4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipInputStream;

public class ReadAndWriteIO {

    public void readAndWrite(String readFile, String writeFile) {

        try {
            try (BufferedReader br = new BufferedReader(new FileReader(readFile))) {
                String fileLine = "";
                try (FileWriter fileWriter = new FileWriter(writeFile)) {
                    while ((fileLine = br.readLine()) != null) {
                        System.out.println(fileLine);

                        int lineLenght = fileLine.length();
                        if (lineLenght < 30 && !fileLine.trim().isEmpty() && fileLine.contains("v")) {
                            fileWriter.write(fileLine + "\n");
                        }
                    }
                    fileWriter.close();
                }
                br.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void readZip(String zipName) {
        try {
            ZipInputStream zipStream = new ZipInputStream(new FileInputStream(zipName));
            zipStream.getNextEntry();
            byte[] buffer = new byte[2048];
            int len = zipStream.read(buffer); // Read into the buffer
            System.out.println(new String(buffer, 0, len));
            zipStream.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}