package com.api.bcb.currency.commom.api.date.simple;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidateSimpleDate {

    private static final SimpleDateFormat pattern = 
            new SimpleDateFormat("MM-dd-yyyy");

    public static boolean isValid(String date) {

        if(date == null) {
            return false;
        }

        try {
            pattern.parse(date);
        } catch(ParseException parseException) {
            return false;
        }
        
        return true;

    }
    
}
