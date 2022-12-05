package tests;

import Builder.GeneratorApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import model.AuthorizationValue;
import model.Generator;
import model.Options;
import model.SecurityDefinition;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class GeneratorClientTestNG {
    Response response;
    JSONObject jsonObject;
    String id;
    ObjectMapper mapper;


    public GeneratorClientTestNG(){
        this.mapper = new ObjectMapper();
        this.jsonObject = new JSONObject();
        this.id = "android";
    }

    @Severity(SeverityLevel.CRITICAL)
    @Step("POST request is starting")
    @Description("Validating to POST request for the client")
    @Test(priority = 1)
    public void validatePostClient() {

        Options options = new Options();
        options.setAdditionalProp1("string");
        options.setAdditionalProp2("string");
        options.setAdditionalProp3("string");

        AuthorizationValue authorizationValue = new AuthorizationValue();
        authorizationValue.setValue("string");
        authorizationValue.setType("string");
        authorizationValue.setKeyName("string");
        authorizationValue.setUrlMatcher("");

        SecurityDefinition securityDefinition = new SecurityDefinition();
        securityDefinition.setType("string");
        securityDefinition.setDescription("string");

        Generator requestGenerator = new Generator();
        requestGenerator.setSpec(" ");
        requestGenerator.setOptions(options);
        requestGenerator.setSwaggerUrl("http://petstore.swagger.io/v2/swagger.jso");
        requestGenerator.setAuthorizationValue(authorizationValue);
        requestGenerator.setUsingFlattenSpec(true);
        requestGenerator.setSecurityDefinition(securityDefinition);

         this.response = GeneratorApi.post("android", requestGenerator);


        assertThat(this.response.getStatusCode(), equalTo(200));

        Generator responseGenerator = this.response.as(Generator.class);

        assertThat(responseGenerator.getSpec(), equalTo(requestGenerator.getSpec()));
        assertThat(responseGenerator.getSwaggerUrl(), equalTo(requestGenerator.getSwaggerUrl()));
        assertThat(this.response.getStatusCode() , equalTo(200));
        assertThat(this.response.getStatusLine(),equalTo("HTTP/1.1 200 OK"));
        assertThat(this.response.getContentType() , equalTo("application/json"));
        assertThat(this.response.getHeader("Connection") , equalTo("keep-alive"));
        assertThat(this.response.getHeader("Transfer-Encoding") , equalTo("chunked"));
    }

    @Severity(SeverityLevel.CRITICAL)
    @Step("GET request is starting")
    @Description("Validating to GET request for client")
    @Test(priority = 2)
    public void validateGetByIdForClient(){

        Response response = GeneratorApi.get(this.id);
        assertThat(response.getStatusCode(),equalTo(200));

        Generator responseGenerator = response.as(Generator.class);

        assertThat(this.response.getStatusCode() , equalTo(200));
        assertThat(this.response.getStatusLine(),equalTo("HTTP/1.1 200 OK"));
        assertThat(this.response.getContentType() , equalTo("application/json"));
        assertThat(this.response.getHeader("Connection") , equalTo("keep-alive"));
        assertThat(this.response.getHeader("Transfer-Encoding") , equalTo("chunked"));
    }

}

