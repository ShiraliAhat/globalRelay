package com.globalRelay.utilities;

import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.reset;

public class globalRelayTestBase {
    @BeforeAll
    public static void init(){
      baseURI="https://277ac029-2b94-49db-9565-e4d7b777e700.mock.pstmn.io";
    }
    @AfterAll
    public static void destroy(){
        reset();
    }
}
