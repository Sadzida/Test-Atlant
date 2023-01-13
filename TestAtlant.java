package starter;
import io.restassured.RestAssured;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
public class TestAtlant {
    @Test
    public void verifyLink(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/").
                then().assertThat().statusCode(200);


}
    @Test
    public void verifyLink2(){
        RestAssured.
                when().get("https://www.mwtestconsultancy.co.uk/").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink3(){
        RestAssured.
                when().get("https://twitter.com/2bittester").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink4(){
        RestAssured.
                when().get("https://www.mwtestconsultancy.co.uk/").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink5(){
        RestAssured.
                when().get("https://github.com/mwinteringham/restful-booker").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink6(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink7(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink8(){
        RestAssured.
                when().get("https://www.buymeacoffee.com/mwinteringham").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink9(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink10(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth-CreateToken").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink11(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink12(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-GetBookings").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink13(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-GetBooking").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink14(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-CreateBooking").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink15(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-UpdateBooking").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink16(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-PartialUpdateBooking").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink17(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Booking-DeleteBooking").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink18(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Ping").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink19(){
        RestAssured.
                when().get("https://restful-booker.herokuapp.com/apidoc/index.html#api-Ping-Ping").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink20(){
        RestAssured.
                when().get("https://www.manning.com/?utm_source=winteringham&utm_medium=affiliate&utm_campaign=affiliate&a_aid=winteringham").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink21(){
        RestAssured.
                when().get("https://www.ministryoftesting.com/go-pro?utm_medium=web&utm_source=restful-booker").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink22(){
        RestAssured.
                when().get("https://automationintesting.com/publictraining/").
                then().assertThat().statusCode(200);
    }
    @Test
    public void verifyLink23(){
        RestAssured.
                when().get("https://apidocjs.com/").
                then().assertThat().statusCode(200);
    }
    }
