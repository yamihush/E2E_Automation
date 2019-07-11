package yami.steps.login;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginSteps {

    public void test(){

        RestAssured.baseURI="www.google.com";

                given().
                queryParam("ke" , "asdflaskdfkfkkkf").
                body("{ \"Lovcation\" : { \"lan\" : -33.333333," +
                        "\"lon\" : 322344423} }").
                when().
                post("/api/add/aster/add/json").
                then().assertThat().statusCode(200).and().contentType("json.applicaiont").and().
                body("equlas",equalTo("OK"));
    }



        @Test
        public void createPlaceAPI()

        {

            RestAssured.baseURI="http://216.10.245.166";

            given().

                           queryParam("key","qaclick123").

                           body("{"+

                                   "\"location\": {"+

                                   "\"lat\": -33.8669710,"+

                                   "\"lng\": 151.1958750"+

                                   "},"+

                                   "\"accuracy\": 50,"+

                                   "\"name\": \"Google Shoes!\","+

                                   "\"phone_number\": \"(02) 9374 4000\","+

                                   "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+

                                   "\"types\": [\"shoe_store\"],"+

                                   "\"website\": \"http://www.google.com.au/\","+

                                   "\"language\": \"en-AU\""+

                                   "}").

                           when().

                           post("/maps/api/place/add/json").

                           then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().log().all().

                           body("status",equalTo("OK"));





        }

    }


