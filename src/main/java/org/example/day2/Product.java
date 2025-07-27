package org.example.day2;

public class Product {
    private int productId;
    private String productName;
    private int productPrice;

    public Product() {
        System.out.println(" Default Constructor : ");
        productId = 102;
        productName = "Maggi Masala";
        productPrice = 100;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        //parameter productId - local variable
        //inside the method - local variable has more priority
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
