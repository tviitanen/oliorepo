import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mainclass {
    public static void main(String[] args) {
        String input1 = "";
        String input2 = "";
        String input = "";
        System.out.print("Give a name to the dog: ");
        Scanner scanner = new Scanner(System.in);
        input1 = scanner.nextLine();
        Dog dog = new Dog(input1);
        System.out.println("Hey, my name is " + dog.getName() + "!");
        while(input2.isEmpty() == true || input2 == "Much wow!") {
            System.out.print("What does a dog say: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                input2 = br.readLine();
            } catch (IOException ex) {
                System.out.println("Virhe!");
            }
                input2.trim();
            System.out.print(dog.getName() + ": ");
            dog.speak(input2);
        }
    }
}