package com.careercamp.dto;

public class ProductDTO
{
    private int prodId;
    private String prodName;
    private int price;
    private int quantity;
    private int discount;
    @Override
    public String toString() {
        return "ProductDTO [prodId=" + prodId + ", prodName=" + prodName
                + ", price=" + price + ", quantity=" + quantity
                + ", discount=" + discount + "]";
    }
    public ProductDTO(int prodId, String prodName, int price, int quantity, int discount) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
    public int getProdId() {
        return prodId;
    }
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }


}