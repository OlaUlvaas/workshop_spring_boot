package se.lexicon.workshop_spring_boot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProductOrderTest {
    @Test
    @DisplayName("Test : Getters And Setters")
    public void test1() {
        List<OrderItem> things = new ArrayList<>();


        Product product1 = new Product();
        product1.setId(2000);
        product1.setName("Orange");
        product1.setPrice(15.50);
        Product product2 = new Product();
        product1.setId(3000);
        product1.setName("Apple");
        product1.setPrice(18.50);
        Product product3 = new Product();
        product1.setId(8000);
        product1.setName("Banana");
        product1.setPrice(12.50);

        OrderItem orderItem1 = new OrderItem();
        orderItem1.setId(15000);
        orderItem1.setQuantity(30);
        orderItem1.setProduct(product1);
        orderItem1.setProductOrder(null);
        OrderItem orderItem2 = new OrderItem();
        orderItem1.setId(12700);
        orderItem1.setQuantity(20);
        orderItem1.setProduct(product2);
        orderItem1.setProductOrder(null);
        OrderItem orderItem3 = new OrderItem();
        orderItem1.setId(67800);
        orderItem1.setQuantity(10);
        orderItem1.setProduct(product3);
        orderItem1.setProductOrder(null);

        AppUser appUser1 = new AppUser();
        appUser1.setId(44);
        appUser1.setFirstName("Olle");
        appUser1.setLastName("Olsson");
        appUser1.setEmail("o.o@live.se");

        AppUser appUser2 = new AppUser();
        appUser2.setId(55);
        appUser2.setFirstName("Nisse");
        appUser2.setLastName("Nilsson");
        appUser2.setEmail("n.n@live.se");

        AppUser appUser3 = new AppUser();
        appUser3.setId(22);
        appUser3.setFirstName("Pelle");
        appUser3.setLastName("Persson");
        appUser3.setEmail("p.p@live.se");




        ProductOrder productOrder = new ProductOrder();
        productOrder.setId(27688);
        productOrder.setOrderDateTime(LocalDateTime.of(2021, 1, 1, 9, 19));
        //Id, orderDateTime, some collection of OrderItem, customer (AppUser)

        //Add objects to "things" - the arrayList at the top of the method
        things.add(orderItem1);
        things.add(orderItem2);
        things.add(orderItem3);

        productOrder.setOrders(things);
        productOrder.setCustomer(appUser1);

        int expectedId = 27688;
        int actualId = productOrder.getId();
        assertEquals(expectedId, actualId);

        LocalDateTime expectedLocalDateTime = LocalDateTime.of(2021,1,1,9,19);
        LocalDateTime actualLocalDateTime = productOrder.getOrderDateTime();
        assertEquals(expectedLocalDateTime, actualLocalDateTime);

        int expectedListSize = 3;
        int actualListSize = things.size();
        assertEquals(expectedListSize, actualListSize);

        int expectedAppUserId = 22;
        int actualAppUserId = appUser3.getId();
        assertEquals(expectedAppUserId, actualAppUserId);


        String expectedAppUserEmail = "n.n@live.se";
        String actualAppUserEmail = appUser2.getEmail();
        assertEquals(expectedAppUserEmail, actualAppUserEmail);


//        public List<OrderItem> addProducts(OrderItem order){
//            orderItems.add(order);
//            return orderItems;
//        }
//        public List<OrderItem> deleteProducts(OrderItem order){
//            orderItems.remove(order);
//            return orderItems;
//        }
//
//
//        public double calculatePriceForAllOrderItems(List<OrderItem> orderItems){
//            double totalPrice = 0;
//            for(OrderItem item : orderItems){
//                totalPrice += item.getProduct().getPrice();
//            }
//            //orderItems.stream().forEach();
//            return totalPrice;
//        }


    }
    @Test
    @DisplayName("Test : Add, delete and calculatePriceForAllOrderItems methods")
    public void test2(){
        //List<OrderItem> things = new ArrayList<>();
        List<OrderItem> listOfOrderItems = new ArrayList<>();

        ProductOrder productOrder = new ProductOrder();
        ProductOrder po1 = new ProductOrder();
        ProductOrder po2 = new ProductOrder();
        ProductOrder po3 = new ProductOrder();

        Product product1 = new Product();
        product1.setId(2000);
        product1.setName("Orange");
        product1.setPrice(15.50);
        Product product2 = new Product();
        product2.setId(3000);
        product2.setName("Apple");
        product2.setPrice(18.50);
        Product product3 = new Product();
        product3.setId(8000);
        product3.setName("Banana");
        product3.setPrice(12.50);

        AppUser appUser1 = new AppUser();
        appUser1.setId(44);
        appUser1.setFirstName("Olle");
        appUser1.setLastName("Olsson");
        appUser1.setEmail("o.o@live.se");

        AppUser appUser2 = new AppUser();
        appUser2.setId(55);
        appUser2.setFirstName("Nisse");
        appUser2.setLastName("Nilsson");
        appUser2.setEmail("n.n@live.se");

        AppUser appUser3 = new AppUser();
        appUser3.setId(22);
        appUser3.setFirstName("Pelle");
        appUser3.setLastName("Persson");
        appUser3.setEmail("p.p@live.se");


        //Id, orderDateTime, some collection of OrderItem, customer (AppUser)
        po1.setId(22222);
        po1.setOrderDateTime(LocalDateTime.of(2021, 2, 2, 12, 25));
        po1.setOrders(listOfOrderItems);
        po1.setCustomer(appUser1);

        po2.setId(44444);
        po2.setOrderDateTime(LocalDateTime.of(2020, 12, 24, 15, 30));
        po2.setOrders(listOfOrderItems);
        po2.setCustomer(appUser2);

        po3.setId(88888);
        po3.setOrderDateTime(LocalDateTime.of(2019, 6, 13, 13, 45));
        po3.setOrders(listOfOrderItems);
        po3.setCustomer(appUser3);


        OrderItem orderItem1 = new OrderItem();
        orderItem1.setId(0);
        orderItem1.setQuantity(30);
        orderItem1.setProduct(product1);
        orderItem1.setProductOrder(productOrder);
        OrderItem orderItem2 = new OrderItem();
        orderItem2.setId(0);
        orderItem2.setQuantity(20);
        orderItem2.setProduct(product2);
        orderItem2.setProductOrder(po2);
        OrderItem orderItem3 = new OrderItem();
        orderItem3.setId(67800);
        orderItem3.setQuantity(10);
        orderItem3.setProduct(product3);
        orderItem3.setProductOrder(po3);

        listOfOrderItems.add(orderItem1);
        listOfOrderItems.add(orderItem2);
        listOfOrderItems.add(orderItem3);

        //productOrder.addProducts(20, product1, po1);
        //productOrder.addProducts(100, product2, po2);
        //productOrder.addProducts(5, product3, po3);


        int expectedId = 88888;
        int actualId = po3.getId();
        assertEquals(expectedId, actualId);

        //TESTA ADD METHOD
        List<OrderItem> expectedList = new ArrayList<>();
        expectedList.add(orderItem1);
        List<OrderItem> actualList = productOrder.addProducts(30, product1, po1);
        assertEquals(expectedList, actualList);

        //TESTA DELETE METHOD
        expectedList.add(orderItem2);
        actualList = productOrder.addProducts(20, product2, po2);
        expectedList.remove(orderItem1);
        actualList = productOrder.deleteProducts(orderItem1);
        assertEquals(expectedList, actualList);


        //TESTA calculatePriceForAllOrderItems METHOD
        double expectedPrice = 30 * 15.5 + 20 * 18.5 + 10 * 12.5;
        double actualPrice = productOrder.calculatePriceForAllOrderItems(listOfOrderItems);
        assertEquals(expectedPrice, actualPrice);

    }

}
