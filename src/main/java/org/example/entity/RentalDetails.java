package org.example.entity;

import java.time.format.DateTimeFormatter;

public class RentalDetails {

    private int id;
    private String customerName;
    private DateTimeFormatter fromDate;
    private DateTimeFormatter lastDate;
    private double price;


    public RentalDetails(int id, String customerName, DateTimeFormatter fromDate, DateTimeFormatter lastDate, double price) {
        this.id = id;
        this.customerName = customerName;
        this.fromDate = fromDate;
        this.lastDate = lastDate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public DateTimeFormatter getFromDate() {
        return fromDate;
    }

    public DateTimeFormatter getLastDate() {
        return lastDate;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setFromDate(DateTimeFormatter fromDate) {
        this.fromDate = fromDate;
    }

    public void setLastDate(DateTimeFormatter lastDate) {
        this.lastDate = lastDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RentalDetails{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", fromDate=" + fromDate +
                ", lastDate=" + lastDate +
                ", price=" + price +
                '}';
    }
}
