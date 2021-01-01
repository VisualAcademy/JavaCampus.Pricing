package com.hawaso.javacampus.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hawaso.javacampus.models.Price;

import org.springframework.stereotype.Service;

@Service
public class PriceService {
    // private List<Price> prices = Arrays.asList(
    //     new Price(1, "챔피언", "20시간", new BigDecimal(5_000.00)),
    //     new Price(2, "스폰서", "100시간", new BigDecimal(30_000.00)),
    //     new Price(3, "VIP", "모든", new BigDecimal(120_000.00))
    // ); 
    private List<Price> prices = new ArrayList<>(Arrays.asList(
        new Price(1, "챔피언", "20시간", new BigDecimal(5_000.00)),
        new Price(2, "스폰서", "100시간", new BigDecimal(30_000.00)),
        new Price(3, "VIP", "모든", new BigDecimal(120_000.00))
    )); 

    public List<Price> getAllPrices() {
        return prices;
    }

    public Price getPriceById(int id) {
        return prices.stream().filter(p -> p.getId() == id).findFirst().get();
    }

    public void addPrice(Price model) {
        //prices.add(4, new Price(4, "test", "test", new BigDecimal(1000)));
        prices.add(model); 
    }

    public void updatePrice(int id, Price model) {
        for (int i = 0; i < prices.size(); i++) {
            Price price = prices.get(i);
            if (price.getId() == id) {
                prices.set(i, model); 
                return;
            }
        }
    }

    public void deletePrice(int id) {
        prices.removeIf(p -> p.getId() == id);
    }
}
