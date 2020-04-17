package tasks;

import io.restassured.http.ContentType;
import reports.Report;

import static io.restassured.RestAssured.given;

public class PokeApiTask {

    public PokeApiTask(){
    }

    public void makeRequest(String name){
        for (int x = 0; x < 6; x++){
            String request = given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.ANY)
                    .get("https://pokeapi.co/api/v2/pokemon/" + name)
                    .then()
                    .statusCode(200)
                    .extract()
                    .response()
                    .asString();
            System.out.println(request);
            Report.log(x + "ª request");
        }
        Report.logFail("O teste falhou, mesmo passando");
    }
}
