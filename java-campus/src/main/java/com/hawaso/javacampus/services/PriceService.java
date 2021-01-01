package com.hawaso.javacampus.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.hawaso.javacampus.models.Price;

import org.springframework.stereotype.Service;

@Service
public class PriceService {
    private List<Price> prices = Arrays.asList(
        new Price(1, "챔피언", "20시간", new BigDecimal(5_000.00)),
        new Price(2, "스폰서", "100시간", new BigDecimal(30_000.00)),
        new Price(3, "VIP", "모든", new BigDecimal(120_000.00))
    ); 

    public List<Price> getAllPrices() {
        return prices;
    }

    public Price getPriceById(int id) {
        return prices.stream().filter(p -> p.getId() == id).findFirst().get();
    }
}
