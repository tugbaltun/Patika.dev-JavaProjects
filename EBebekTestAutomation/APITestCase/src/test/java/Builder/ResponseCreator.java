package Builder;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ResponseCreator {
    public static Response post(String path ,Object requestClient){

        return given(Build.getRequestSpec()).
                body(requestClient).
                when().
                post(path).
                then().
                spec(Build.getResponseSpec()).
                extract().
                response();
    }

    public static Response get(String path){

        return given(Build.getRequestSpec()).
                when().
                get(path).
                then().
                spec(Build.getResponseSpec()).
                extract().
                response();
    }
}
