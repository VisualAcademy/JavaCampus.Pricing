package com.hawaso.javacampus.controllers;

// import java.math.BigDecimal;
// import java.util.Arrays;
import java.util.List;

import com.hawaso.javacampus.models.Price;
import com.hawaso.javacampus.services.PriceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PricesController {
    // @GetMapping("/prices")
    // public String getAllPrices() {
    //     return "All Prices";
    // }

    // @GetMapping("/prices")
    // public List<Price> getAllPrices() {
    //     return Arrays.asList(
    //         new Price("챔피언", "10시간", new BigDecimal(5_000.00)),
    //         new Price("스폰서", "100시간", new BigDecimal(30_000.00)),
    //         new Price("VIP", "모든", new BigDecimal(120_000.00))
    //     ); 
    // }

    @Autowired
    private PriceService priceService;

    @GetMapping("/prices")
    public List<Price> getAllPrices() {
        return priceService.getAllPrices();
    }

    @GetMapping("/prices/{id}")
    public Price getPriceById(@PathVariable int id) {
        return priceService.getPriceById(id); 
    }
}
