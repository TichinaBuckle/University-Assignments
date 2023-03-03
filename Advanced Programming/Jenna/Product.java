package model;

import java.io.Serializable;

public class Product implements Serializable {
    private String stockId;
    private String name;
    private String description;
    private float price;
    
    public Product() {}
    
    public Product(String stockId, String name, String description, float price) {
        this.stockId = stockId;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    
    public String getStockId() {
        return stockId;
    }
    
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
}
