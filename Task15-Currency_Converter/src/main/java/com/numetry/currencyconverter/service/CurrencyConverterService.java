package com.numetry.currencyconverter.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CurrencyConverterService {

	@Value("${exchange.rate.usd.eur}")
	private double usdToEurRate;

	@Value("${exchange.rate.usd.gbp}")
	private double usdToGbpRate;

	@Value("${exchange.rate.usd.inr}")
	private double usdToInrRate;

	@Value("${exchange.rate.inr.usd}")
	private double inrToUsdRate;

	@Value("${exchange.rate.inr.eur}")
	private double inrToEurRate;

	@Value("${exchange.rate.inr.gbp}")
	private double inrToGbpRate;

	public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
		if (fromCurrency.equals(toCurrency)) {
			return amount;
		}

		Map<String, Double> exchangeRates = getExchangeRates(fromCurrency);

		if (exchangeRates.containsKey(toCurrency)) {
			double exchangeRate = exchangeRates.get(toCurrency);
			return amount * exchangeRate;
		} else {
			throw new RuntimeException("Exchange rate not found for the provided currencies.");
		}
	}

	private Map<String, Double> getExchangeRates(String fromCurrency) {
		Map<String, Double> exchangeRates = new HashMap<>();

		switch (fromCurrency) {
		case "USD":
			exchangeRates.put("EUR", usdToEurRate);
			exchangeRates.put("GBP", usdToGbpRate);
			exchangeRates.put("INR", usdToInrRate);
			break;
		case "INR":
			exchangeRates.put("USD", inrToUsdRate);
			exchangeRates.put("EUR", inrToEurRate);
			exchangeRates.put("GBP", inrToGbpRate);
			break;

		default:
			throw new RuntimeException("Unsupported source currency: " + fromCurrency);
		}

		return exchangeRates;
	}
}
