package com.example.currencyconverter.request;

import lombok.Data;

@Data
public class ConversionRequest {
    private double amount;
    private String fromCurrency;
    private String toCurrency;  
}
