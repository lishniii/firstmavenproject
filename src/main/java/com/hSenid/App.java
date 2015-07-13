package com.hSenid;

import org.joda.time.*;

public class App {

    public static void main( String[] args ) {

        DateTime today = new DateTime();

        DateTime tomorrow = today.plusDays(1);
        
        System.out.println("Dates");

        System.out.println(today.toString("yyyy-MMM-dd"));

        System.out.println(tomorrow.toString("yyyy-MMM-dd"));
    }
}
