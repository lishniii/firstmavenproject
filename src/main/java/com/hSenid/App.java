package com.hSenid;

import org.joda.time.*;

public class App {

    public static void main( String[] args ) {

        DateTime today = new DateTime();

        DateTime tomorrow = today.plusDays(1);
        
        System.out.println("Lishni edited this, tadadadaaaa");
        
        System.out.println("Dates");

        System.out.println("Todays date is: "+today.toString("yyyy-MMM-dd"));
        
         System.out.println("==================================");

<<<<<<< HEAD
        System.out.println(tomorrow.toString("yyyy-MMM-dd"));

	System.out.println("Change by Hiran");
=======
        System.out.println("Tomorrows date is: "+tomorrow.toString("yyyy-MMM-dd"));
        
<<<<<<< HEAD
       
        
=======
>>>>>>> 5dffafd08ab3430ae3c0c981628e07a78e822ef4
>>>>>>> master
    }
}
