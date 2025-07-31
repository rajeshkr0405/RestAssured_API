import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class LocalAPITesting {
    @Test
    public void get_demo(){
        baseURI = "http://localhost:3000/";
        given()
                .param("name", "rajesh")
                .get("/users")
                .then()
                .statusCode(200)
                .log().all();
    }
    @Test
    public void post_demo(){
        baseURI ="http://localhost:3000/";
        JSONObject req = new JSONObject();
        req.put("name","John");
        req.put("email","john123@gmail.com");
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(req.toJSONString())
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().all();

    }
    @Test
    public void put_demo(){
        baseURI ="http://localhost:3000/";
        JSONObject req = new JSONObject();
        req.put("name","ram");
        req.put("email","john123@gmail.com");
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(req.toJSONString())
                .when()
                .put("/users/63e8")
                .then()
                .statusCode(200)
                .log().all();

    }
    @Test
    public void delete_demo(){
        baseURI ="http://localhost:3000/";
        given()
                .delete("/users/2755")
                .then()
                .statusCode(200)
                .log().all();
    }
}
