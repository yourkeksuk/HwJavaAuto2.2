import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class NetologyTest {
    @Test
    void testTest(){
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body(/* --> ваша проверка здесь <-- */);
    }
}
