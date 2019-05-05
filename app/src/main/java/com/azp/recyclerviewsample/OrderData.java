package com.azp.recyclerviewsample;

public class OrderData {

    private String orderID;
    private String orderRequest;
    private String orderStatus;
    private String orderDate;
    private String orderItemCount;
    private String orderPrice;

    public OrderData(String orderID, String orderRequest, String orderStatus, String orderDate, String orderItemCount, String orderPrice) {
        this.orderID = orderID;
        this.orderRequest = orderRequest;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.orderItemCount = orderItemCount;
        this.orderPrice = orderPrice;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getOrderRequest() {
        return orderRequest;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getOrderItemCount() {
        return orderItemCount;
    }

    public String getOrderPrice() {
        return orderPrice;
    }
}
