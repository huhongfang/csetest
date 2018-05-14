package com.service.csehhftest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-05-14T07:11:17.544Z")

@RestSchema(schemaId = "csehhftest")
@RequestMapping(path = "/csehhftest", produces = MediaType.APPLICATION_JSON)
public class CsehhftestImpl {

    @Autowired
    private CsehhftestDelegate userCsehhftestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCsehhftestDelegate.helloworld(name);
    }

}
