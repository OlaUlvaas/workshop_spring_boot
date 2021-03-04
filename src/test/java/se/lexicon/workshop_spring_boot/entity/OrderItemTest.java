package se.lexicon.workshop_spring_boot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OrderItemTest {
    @Test
    @DisplayName("Test1 : Getters And Setters + calculatePrice")
    public void test1() {
        Product product = new Product();
        product.setId(2000);
        product.setName("Orange");
        product.setPrice(15.50);
        //Id, quantity, product,
        //productOrder
        OrderItem orderItem = new OrderItem();
        orderItem.setId(2700);
        orderItem.setQuantity(10);
        orderItem.setProduct(product);
        orderItem.setProductOrder(null);


        int expectedId = 2700;
        int actualId = orderItem.getId();
        Assertions.assertEquals(expectedId, actualId);

        int expectedQuantity = 10;
        int actualQuantity = orderItem.getQuantity();
        Assertions.assertEquals(expectedQuantity, actualQuantity);

        Product expectedProduct = product;
        Product actualProduct = orderItem.getProduct();
        Assertions.assertEquals(expectedProduct,actualProduct);

        ProductOrder expectedProductOrder = null;
        ProductOrder actualProductOrder = orderItem.getProductOrder();
        Assertions.assertEquals(expectedProductOrder, actualProductOrder);

        double expectedCalculatePrice = 155.0;
        double actualCalculatePrice = orderItem.calculatePrice(orderItem.getQuantity(), orderItem.getProduct());
        Assertions.assertEquals(expectedCalculatePrice, actualCalculatePrice);

    }


}
