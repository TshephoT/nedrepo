package APITest;

import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class APIService {

    public static void getGBPPrice(){
        String url = "https://api.coindesk.com/v1/bpi/currentprice.json";

        Response response = given()
                .contentType("application/json")
                .get(url);

//        String body = response.getBody().asPrettyString();
        String GBPPrice = new JSONObject(response.getBody().asString()).getString("bpi");

        System.out.println(GBPPrice);
    }
}
