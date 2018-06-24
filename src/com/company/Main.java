package com.company;

import com.company.model.RatePb;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    private static final String URL = "https://api.privatbank.ua/p24api/exchange_rates?json&date=01.12.2014";

    public static void main(String[] args) {

        String result = HttpUtil.sendRequest(URL, null, null);

        //System.out.println("Result: " + result);

        Gson gson = new GsonBuilder().create();

        RatePb ratePb = gson.fromJson(result, RatePb.class);

        System.out.println("Our data: " + ratePb);



    }
}
