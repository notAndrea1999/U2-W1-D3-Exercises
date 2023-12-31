package andreademasi;

import andreademasi.entities.ElementiMenu;
import andreademasi.entities.Ordine;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
public class OrderTests {

    static Ordine testOrdine;
    private static AnnotationConfigApplicationContext ctx;

    @BeforeAll
    public static void beforeAll() {
        log.info("BEFORE ALL");
        ctx = new AnnotationConfigApplicationContext(U2W1D1EexercisesApplication.class);
        testOrdine = ctx.getBean(Ordine.class);
        testOrdine.setMenuList((List<ElementiMenu>) ctx.getBean("getList"));
        testOrdine.total();

    }

    @Test
    public void testContoCoperti() {
        double total = testOrdine.getContoCoperti();
        assertEquals(9, total);
    }

    @Test
    public void testContoOrdine() {
        double total = testOrdine.getTotal();
        assertEquals(26.55, total);
    }


}

