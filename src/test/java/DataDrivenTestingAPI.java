import Data.DataForTest;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DataDrivenTestingAPI extends DataForTest {


    @Test(dataProvider = "data_for_post")
    public void post_demo (String name, int id){
        baseURI ="http://localhost:3000/";
        JSONObject req = new JSONObject();
        req.put("name",name);
        req.put("id",id);
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
    @Test(dataProvider = "data_for_delete")
    public void delete_demo(int id){
        baseURI ="http://localhost:3000/";
        given()
                .delete("/users/"+id)
                .then()
                .statusCode(404)
                .log().all();
    }
}
