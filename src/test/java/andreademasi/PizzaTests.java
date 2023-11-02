package andreademasi;

import andreademasi.entities.Pizze;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
public class PizzaTests {
    static Pizze testPizze;
    private static AnnotationConfigApplicationContext ctx;

    @BeforeAll
    static void beforeAll() {
        log.info("BEFORE ALL");
        ctx = new AnnotationConfigApplicationContext(U2W1D1EexercisesApplication.class);
        testPizze = (Pizze) ctx.getBean("getMargherita");
    }

    @Test
    public void testPizzaNotNull() {
        assertNotNull(testPizze);
    }

    @Test
    public void testIsMargherita() {
        Pizze pizza1 = (Pizze) ctx.getBean("getMargherita");
        assertSame(pizza1, testPizze);
    }

    @Test
    public void test() {
        Pizze pizza1 = (Pizze) ctx.getBean("getSalamiPizza");
        assertEquals(pizza1.getPrice(), testPizze.getPrice());
    }

    @AfterAll
    public void afterAll() {
        ctx.close();
    }
}
