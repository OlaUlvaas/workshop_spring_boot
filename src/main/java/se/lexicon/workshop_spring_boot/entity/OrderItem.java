package se.lexicon.workshop_spring_boot.entity;
import se.lexicon.workshop_spring_boot.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Objects;

//@Repository
//@Entity
public class OrderItem {
    //Id, quantity, product
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //@Column(nullable = false)
    private int quantity;
    //@Column(nullable = false)
    private Product product;
//    @Column(nullable = false)
    private ProductOrder productOrder;

    public OrderItem() {
    }

    public OrderItem(int quantity, Product product, ProductOrder productOrder) {
        this.quantity = quantity;
        this.product = product;
        this.productOrder = productOrder;
    }

    public OrderItem(int id, int quantity, Product product, ProductOrder productOrder) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
        this.productOrder = productOrder;
    }

    public double calculatePrice(int quantity, Product product){
        return quantity * product.getPrice();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return id == orderItem.id && quantity == orderItem.quantity && Objects.equals(product, orderItem.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, product);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
