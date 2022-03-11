package week4;

public class Mainclass {
    public static void main(String[] args) {
        String readFile = "input.txt";
        String writeFile = "output.txt";
        String zipName = "zipinput.zip";
        ReadAndWriteIO RaWIO = new ReadAndWriteIO();
        // RaWIO.readAndWrite(readFile, writeFile);
        RaWIO.readZip(zipName);
    }
}