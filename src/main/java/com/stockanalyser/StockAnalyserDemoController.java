package com.stockanalyser;

import io.micronaut.http.annotation.*;

@Controller("/stockAnalyserDemo")
public class StockAnalyserDemoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}