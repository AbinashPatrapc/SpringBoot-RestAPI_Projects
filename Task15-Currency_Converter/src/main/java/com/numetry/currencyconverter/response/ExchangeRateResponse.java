package com.numetry.currencyconverter.response;
import java.util.Map;

import lombok.Data;

@Data
public class ExchangeRateResponse {

    private Map<String, Double> rates;
}
