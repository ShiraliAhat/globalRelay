package com.globalRelay.API;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class getRequest {


    @Test
    public void pathParamsTest(){

        // create response body
         Response response = given().accept(ContentType.JSON)

                .when().get("http://ergast.com/api/f1/drivers.Json");

         //verify status code is 200
         assertEquals("statusCode is not 200",response.statusCode(),200);

         //verify name is Allen
      //  assertTrue("name is not Allen",response.asString().contains("Allen"));

      response.prettyPeek();
        System.out.println("===================");
        System.out.println(response.contentType());
        JsonPath jsonPath = response.jsonPath();
        System.out.println((Map) jsonPath.get("MRData"));


    }

    @Test
    public void test1(){

        given().accept(ContentType.JSON)
                .get("http://ergast.com/api/f1/drivers.Json").prettyPeek()
                .then().assertThat().statusCode(200)
                .and().assertThat().body("MRData.DriverTable.Drivers.driverId[0]", Matchers.equalTo("abate"));

    }

    @Test
    public void  test2(){

        Response response = given().accept(ContentType.JSON)
                .get("http://ergast.com/api/f1/drivers.Json");

       // System.out.println(response.headers());
        Map<String,Object> oneMap = response.body().as(Map.class);
        System.out.println(oneMap.size());

        String str = "shirali";
        System.out.println("\"" + str + "\"");

    }



}
