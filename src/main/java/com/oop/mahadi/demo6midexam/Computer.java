package com.oop.mahadi.demo6midexam;

import java.io.Serializable;

public class Computer implements Serializable {
    int serialNo;
    String brand,model;
    float price;
    boolean hasGpu;
    int noofGpuCore;

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serialNo=" + serialNo +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasGpu=" + hasGpu +
                ", noofGpuCore=" + noofGpuCore +
                '}';
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isHasGpu() {
        return hasGpu;
    }

    public void setHasGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }

    public int getNoofGpuCore() {
        return noofGpuCore;
    }

    public void setNoofGpuCore(int noofGpuCore) {
        this.noofGpuCore = noofGpuCore;
    }

    public Computer(int serialNo, String brand, String model, float price, boolean hasGpu, int noofGpuCore) {
        this.serialNo = serialNo;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasGpu = hasGpu;
        this.noofGpuCore = noofGpuCore;
    }
}

