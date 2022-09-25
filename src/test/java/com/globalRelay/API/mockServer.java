package com.globalRelay.API;

import com.globalRelay.utilities.globalRelayTestBase;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;

public class mockServer extends globalRelayTestBase {


    @Test
    public void getFirstPatientFirstNameAndLastName() {

        JsonPath js = given().log().uri()
                .when().get("/globalRelay").prettyPeek()
                .then()
                .statusCode(200).extract().jsonPath();

        List<String> allPatientFirstName = js.getList("givenName");
        List<String> allPatientLastName = js.getList("familyName");

        System.out.println("FirstName: " + allPatientFirstName.get(0));
        System.out.println("LastName: " + allPatientLastName.get(0));



        List<String> listOfNationality = js.getList("nationality");

        int countItalian = 0;

        for (String each :listOfNationality) {
            if (each.equals("Italian")){
                countItalian++;
            }
        }
        System.out.println("We have " + countItalian + " Italian in total");

    }
}
