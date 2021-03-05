package se.lexicon.workshop_spring_boot.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductOrder {
    //Id, orderDateTime, some collection of OrderItem, customer (AppUser)
    private int id;
    private LocalDateTime orderDateTime;
    List<OrderItem> orders = new ArrayList<>();
    AppUser customer;

    public ProductOrder() {
    }

    public ProductOrder(LocalDateTime orderDateTime, List<OrderItem> orders, AppUser customer) {
        this.orderDateTime = orderDateTime;
        this.orders = orders;
        this.customer = customer;
    }

    public ProductOrder(int id, LocalDateTime orderDateTime, List<OrderItem> orders, AppUser customer) {
        this.id = id;
        this.orderDateTime = orderDateTime;
        this.orders = orders;
        this.customer = customer;
    }

    private List<OrderItem> orderItems = new ArrayList<>();

    public List<OrderItem> addProducts(int quantity, Product product, ProductOrder productOrder){
        //Id, quantity, product, productOrder
        OrderItem orderItem = new OrderItem();
        orderItem.setQuantity(quantity);
        orderItem.setProduct(product);
        orderItem.setProductOrder(productOrder);
        orderItems.add(orderItem);
        return orderItems;
    }
    public List<OrderItem> deleteProducts(OrderItem order){
        orderItems.remove(order);
        return orderItems;
    }


    public double calculatePriceForAllOrderItems(List<OrderItem> orderItems){
        double totalPrice = 0;
        for(OrderItem item : orderItems){
            totalPrice += item.getProduct().getPrice() * item.getQuantity();
        }
        //orderItems.stream().forEach();
        return totalPrice;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderItem> orders) {
        this.orders = orders;
    }

    public AppUser getCustomer() {
        return customer;
    }

    public void setCustomer(AppUser customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductOrder that = (ProductOrder) o;
        return id == that.id && Objects.equals(orderDateTime, that.orderDateTime) && Objects.equals(orders, that.orders) && Objects.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDateTime, orders, customer);
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "id=" + id +
                ", orderDateTime=" + orderDateTime +
                ", orders=" + orders +
                ", customer=" + customer +
                '}';
    }
}
