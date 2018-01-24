package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService {

    ServiceDelegate serviceDelegate = new ServiceDelegate();


    @Test
    public void testhelloworld(){
        
        final String NAME = "Peter";

        String expactReturnValue = "hi, " + NAME + "! welcome to serviceStage World"; // You should put the expect String type value here.

        String returnValue = serviceDelegate.sayHi("Peter");

        assertEquals(expactReturnValue, returnValue);
    }

}
