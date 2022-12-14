package ru.netology.apiAuto;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
//import static org.apache.commons.codec.digest.UnixCrypt.body;

public class Test1 {


    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then

        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200)
         .body(matchesJsonSchemaInClasspath("accounts.schema.json"));
    }


}