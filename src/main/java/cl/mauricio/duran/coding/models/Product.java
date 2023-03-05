package cl.mauricio.duran.coding.models;

import jakarta.persistence.*;
import lombok.NonNull;

import java.util.List;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 13, unique = true, nullable = false)
    @NonNull
    private String sku;

    @Column(length = 50, unique = true, nullable = false)
    @NonNull
    private String name;

    @Column(length = 50, unique = true, nullable = false)
    @NonNull
    private String brand;

    @Column(nullable = true)
    private String size;

    @Column(unique = true, nullable = false)
    @NonNull
    private Double price;

    @Column(unique = true, nullable = false)
    @NonNull
    private String principal_image;

    @Column(unique = true, nullable = true)
    private String other_image;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPrincipal_image() {
        return principal_image;
    }

    public void setPrincipal_image(String principal_image) {
        this.principal_image = principal_image;
    }

    public String getOther_image() {
        return other_image;
    }

    public void setOther_image(String other_image) {
        this.other_image = other_image;
    }
}
