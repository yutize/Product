import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Product {
    private String productId;
    private String productName;
    private String productDesc;
    private double productCost;

    // Constructors
    public Product(String productId, String productName, String productDesc, double productCost) {
       this.productId = productId;
       this.productName = productName;
       this.productDesc = productDesc;
       this.productCost = productCost;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    public String toCSVDataRecord() {
        return productId + "," + productName + "," + productDesc + "," + productCost;
    }
}