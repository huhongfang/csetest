package com.service.csehhftest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCsehhftest {

        CsehhftestDelegate csehhftestDelegate = new CsehhftestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = csehhftestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}