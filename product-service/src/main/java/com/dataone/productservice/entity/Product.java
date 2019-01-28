package com.dataone.productservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DATAONE_PRODUCTS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "brand")
    private String brand;
    @Column(name = "on_sale")
    private Boolean onSale;

    public Product() {

    }

    public Product(Integer id, String name, Double price, String brand, Boolean onSale) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.onSale = onSale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Boolean getOnSale() {
        return onSale;
    }

    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }



    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", onSale=" + onSale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(brand, product.brand) &&
                Objects.equals(onSale, product.onSale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, brand, onSale);
    }
}
