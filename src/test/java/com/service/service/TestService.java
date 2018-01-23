package com.service.service.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService {

    ServiceDelegate serviceDelegate = new ServiceDelegate();


    @Test
    public void testsayhi(){

        String expactReturnValue = "hi, name! welcome to ServiceStage"; // You should put the expect String type value here.

        String returnValue = serviceDelegate.sayHi("name");

        assertEquals(expactReturnValue, returnValue);
    }

}
