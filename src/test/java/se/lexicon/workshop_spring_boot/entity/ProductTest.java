package se.lexicon.workshop_spring_boot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductTest {
    @Test
    @DisplayName("Test1 : Getters And Setters")
    public void test1() {
    //Id, name, price
        Product product = new Product();
        product.setName("Book");
        product.setPrice(299.50);
        product.setId(1000);

        int expectedId = 1000;
        int actualId = product.getId();
        Assertions.assertEquals(expectedId, actualId);

        String expectedName = "Book";
        String actualName = product.getName();
        Assertions.assertEquals(expectedName, actualName);

        Double expectedPrice = 299.50;
        Double actualPrice = product.getPrice();
        Assertions.assertEquals(expectedPrice, actualPrice);
    }
}
