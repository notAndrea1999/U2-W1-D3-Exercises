package andreademasi.runner;

import andreademasi.U2W1D1EexercisesApplication;
import andreademasi.entities.ElementiMenu;
import andreademasi.entities.Ordine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
@Order(1)
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D1EexercisesApplication.class);
        List<ElementiMenu> elementiMenuList = new ArrayList<>(Arrays.asList((ElementiMenu) ctx.getBean("getSalamiPizza"),
                (ElementiMenu) ctx.getBean("getSalamiPizza"),
                (ElementiMenu) ctx.getBean("getLemonade"),
                (ElementiMenu) ctx.getBean("getLemonade")));

        Ordine ordine1 = (Ordine) ctx.getBean("order_component");

        ordine1.setMenuList(elementiMenuList);
        ordine1.total();
        log.info(ordine1.toString());
        ctx.close();
    }
}
