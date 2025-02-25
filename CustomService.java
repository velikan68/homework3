package ru.netology.service;

public class CustomService {

    public static final int DUTY_WEIGHT = 100;

    public static int calculateCustoms(int productPrice, int productWeight) {
    int dutyProduct = 100; // 1 копейка за каждый рубль цены товара
    // int DUTY_WEIGHT = 100; // 100 рублей за каждый килограмм товара

    int dutyPrice = productPrice / dutyProduct + productWeight * DUTY_WEIGHT;

    return dutyPrice;
    }
}