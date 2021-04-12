package com.stockanalyser;

import io.micronaut.http.annotation.*;

@Controller("/stockAnalyserDemo")
public class StockAnalyserDemoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
    	System.out.println("Example response");
        return "Example Response";
    }
}