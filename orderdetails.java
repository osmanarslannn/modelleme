package org.example;

public class OrderDetail {
    private int id;
    private int orderId;
    private int bookId;
    private String cargoNo;
    private String orderStatus;
    private int quantity;
    private double unitPrice;

    private double discount;

    public OrderDetail() {
    }

    public OrderDetail(int id, int orderId, int bookId, String cargoNo, String orderStatus, int quantity, double unitPrice, double discount) {
        this.id = id;
        this.orderId = orderId;
        this.bookId = bookId;
        this.cargoNo = cargoNo;
        this.orderStatus = orderStatus;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCargoNo() {
        return cargoNo;
    }

    public void setCargoNo(String cargoNo) {
        this.cargoNo = cargoNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}