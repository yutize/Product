import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class ProductReader {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                Scanner sc = new Scanner(file);
                System.out.println("ID#      ProductName          Description       Cost");
                System.out.println("=================================================================");
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] data = line.split(",");
                    String formattedData = String.format("%-10s %-15s %-15s %s", data[0], data[1], data[2], data[3]);
                    System.out.println(formattedData);
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading file " + file.getName());
            }
        }
    }
}
