import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITestNGTestCases {

    @Test
    public void test1(){
       Response response =get("https://reqres.in/api/users?page=2");
        System.out.println("Response : "+response.asString());
        System.out.println("StatusCode : "+response.getStatusCode());
        System.out.println("Body : "+response.getBody());
        System.out.println("Header : "+response.getHeader("content-type"));
        int statuscode=response.getStatusCode();
        Assert.assertEquals(statuscode,200);
    }
    @Test
    public void test2(){
    given().get("https://reqres.in/api/users?page=2").
            then().
            statusCode(200);
    }

}
