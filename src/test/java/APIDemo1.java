import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.hamcrest.Matchers.*;

@Test
public class APIDemo1 {
    public void getDemo1(){
        given()
                .header("Content-Type","appliction/json")
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.first_name[4]",equalTo("George"))
                .body("data.first_name",hasItems("George", "Tobias", "Michael"))
                .log().all();

    }
    @Test
    public void postDemo1(){

        JSONObject req= new JSONObject();
        req.put("name", "Rajesh");
        req.put("Job", "IT");
        System.out.println(req.toJSONString());

        given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(req.toJSONString())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(401);



    }@Test
    public void putDemo1(){

        JSONObject req= new JSONObject();
        req.put("name", "Rajesh");
        req.put("Job", "IT");
        System.out.println(req.toJSONString());

        given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(req.toJSONString())
                .when()
                .put("https://reqres.in/api/users/2")
                .then()
                .statusCode(401);



    }
    @Test
    public void patchDemo1(){

        JSONObject req= new JSONObject();
        req.put("name", "Rajesh");
        req.put("Job", "IT");
        System.out.println(req.toJSONString());

        given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(req.toJSONString())
                .when()
                .patch("https://reqres.in/api/users/2")
                .then()
                .statusCode(401);



    }
    @Test
    public void deleteDemo(){
        given()
                .delete("https://reqres.in/api/users/2")
                .then()
                .statusCode(401)
                .log().all();
    }
}
