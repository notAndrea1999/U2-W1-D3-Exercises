package andreademasi;

import andreademasi.entities.Toppings;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
public class ToppingTests {
    static Toppings toppingsTest;
    private static AnnotationConfigApplicationContext ctx;

    @BeforeAll
    static void beforeAll() {
        log.info("BEFORE ALL");
        ctx = new AnnotationConfigApplicationContext(U2W1D1EexercisesApplication.class);
        toppingsTest = (Toppings) ctx.getBean("getHam");
    }

    @Test
    public void testToppingNotNull() {
        assertNotNull(toppingsTest);
    }
}
