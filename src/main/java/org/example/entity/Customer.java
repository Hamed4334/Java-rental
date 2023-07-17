package org.example.entity;

import java.util.List;

public class Customer {

    private int id;
    private String name;
    private int age;
    private String licenseNumber;
    private String nationalId;

    private List<Car> carRented;


    public Customer() {
        this.id = id;
        this.name = name;
        this.age = age;
        this.licenseNumber = licenseNumber;
        this.nationalId = nationalId;
        this.carRented = carRented;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getNationalId() {
        return nationalId;
    }

    public List<Car> getCarRented() {
        return carRented;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setCarRented(List<Car> carRented) {
        this.carRented = carRented;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", carRented=" + carRented +
                '}';
    }
}
