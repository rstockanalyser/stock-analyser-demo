package com.stockanalyser;

import io.micronaut.http.annotation.*;

@Controller("/api")
public class StockAnalyserDemoController {

    @Get(uri="/resp", produces="text/plain")
    public String index() {
    	System.out.println("Example response");
        return "Example Response";
    }
}