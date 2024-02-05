
package com.numetry.currencyconverter.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.currencyconverter.request.ConversionRequest;
import com.numetry.currencyconverter.service.CurrencyConverterService;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrencyConverterService converterService;

    @PostMapping("/convert")
    public String convertCurrency(@RequestBody ConversionRequest conversionRequest) {
        return "Exchange Rate for "+conversionRequest.getFromCurrency()+" to "+conversionRequest.getToCurrency()+" is "+converterService.convertCurrency(
                conversionRequest.getAmount(),
                conversionRequest.getFromCurrency(),
                conversionRequest.getToCurrency());
    }
}
