package com.requestHandler;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import org.junit.After;
import org.junit.Before;

public class PrepareToRequest {

    RequestSpecification requestSpecification;
    public String searchData;

    @Before
    public void setUp() throws Exception
    {
        init();
    }

    private void init() throws Exception
    {
        RestAssured.baseURI="http://www.omdbapi.com/";
        searchData="Harry Potter";
    }


    @After
    public void tearDown()
    {

    }

}
