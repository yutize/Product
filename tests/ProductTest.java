import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p1, p2, p3, p4;

    @BeforeEach
    void setUp()
    {
        p1 = new Product("000001", "iPhone", "A Simple phone", 9999.99);
        p2 = new Product("000002", "Water Bottle", "Just a Water Bottle", 12.00);
        p3 = new Product("000003", "Laptop", "A portable computer", 150.99);
        p4 = new Product("000004", "20 Piece McNuggets", "Nuggies", 1.00);

    }

    @org.junit.jupiter.api.Test
    void setProductId() {
        p1.setProductId("000002");
        assertEquals("000002", p1.getProductId());
    }

    @org.junit.jupiter.api.Test
    void setProductName() {
        p1.setProductName("Water Bottle");
        assertEquals("Water Bottle", p1.getProductName());
    }

    @org.junit.jupiter.api.Test
    void setProductDesc() {
        p1.setProductDesc("Just a Water Bottle");
        assertEquals("Just a Water Bottle", p1.getProductDesc());
    }

    @org.junit.jupiter.api.Test
    void setProductCost() {
        p1.setProductCost(12.00);
        assertEquals(12.00, p1.getProductCost());
    }
}