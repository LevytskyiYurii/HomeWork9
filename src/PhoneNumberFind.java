import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneNumberFind {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\file.txt");
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());

    }
}
