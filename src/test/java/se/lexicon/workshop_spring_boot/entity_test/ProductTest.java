package se.lexicon.workshop_spring_boot.entity_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import se.lexicon.workshop_spring_boot.entity.AppUser;
import se.lexicon.workshop_spring_boot.entity.Product;

@SpringBootTest
public class ProductTest {
    @Test
    @DisplayName("Test1 : Getters And Setters")
    public void test1() {
    //Id, name, price
        Product product = new Product();
        product.setName("Book");
        product.setPrice(299.50);


        String expectedProduct = "Book";
        String actualProduct = product.getName();
        Assertions.assertEquals(expectedProduct, actualProduct);

        Double expectedPrice = 299.50;
        Double actualPrice = product.getPrice();
        Assertions.assertEquals(expectedProduct, actualProduct);

//        String expectedEmail = "ola@home.se";
//        String actualEmail = appUser.getEmail();
//        Assertions.assertEquals(expectedEmail, actualEmail);
//
//        String expectedFirstName = "Ola";
//        String actualFirstName = appUser.getFirstName();
//        Assertions.assertEquals(expectedEmail, actualEmail);
//
//        String expectedLastName = "Ulvås";
//        String actualLastName = appUser.getLastName();
//        Assertions.assertEquals(expectedEmail, actualEmail);
    }
}
