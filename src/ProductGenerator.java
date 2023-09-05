import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductGenerator {
    public static void main(String[] args) {
        ArrayList<String> productData = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter product's ID:");
            String productId = input.nextLine();

            System.out.println("Enter product's name:");
            String productName = input.nextLine();

            System.out.println("Enter product's description:");
            String productDesc = input.nextLine();

            System.out.println("Enter product's cost:");
            double productCost = input.nextDouble();
            input.nextLine(); // Consume the newline left in the input buffer

            String singleProductData = productId + ", " + productName + ", " + productDesc + ", " + productCost;
            productData.add(singleProductData);

            System.out.println("Do you want to enter more information? (yes/no)");
            String continueInput = input.nextLine().toLowerCase();
            if (!continueInput.equals("yes")) {
                break;
            }
        }

        System.out.println("Enter the file name to save the data:");
        String fileName = input.next();

        try {
            FileWriter writer = new FileWriter(fileName + ".txt");
            for (String data : productData) {
                writer.write(data + "\n");
            }
            writer.close();
            System.out.println("Data saved to " + fileName + ".txt");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file.");
            e.printStackTrace();
        }
    }
}








