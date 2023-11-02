package andreademasi.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@Component("order_component")
@PropertySource("application.properties")
public class Ordine {
    private int orderId;
    private Tavolo tavolo;
    private List<ElementiMenu> menuList;
    private OrderStatus orderStatus;
    private int numeroCoperti;
    private LocalTime orderTime;
    private double total;
    @Value("${costo_coperto}")
    private double costoCoperto;

    public Ordine(Tavolo tavolo, @Value("6") int numeroCoperti) {
        Random rndm = new Random();
        this.orderId = rndm.nextInt(1, 100);
        this.tavolo = tavolo;
        this.orderStatus = OrderStatus.IN_CORSO;
        this.numeroCoperti = numeroCoperti;
        this.orderTime = LocalTime.of(18, 26);
    }


    public void total() {
        menuList.forEach(elem -> this.total = this.total + elem.getPrice());
        this.total = this.total + (numeroCoperti * costoCoperto);
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "orderId=" + orderId +
                ", tavolo=" + tavolo +
                ", menuList=" + menuList +
                ", orderStatus=" + orderStatus +
                ", numeroCoperti=" + numeroCoperti +
                ", orderTime=" + orderTime +
                ", total=" + total +
                '}';
    }
}

