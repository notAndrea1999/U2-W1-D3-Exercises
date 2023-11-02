package andreademasi.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Setter
@ToString
@Component
@PropertySource("application.properties")
public class Tavolo {

    private int tavoloId;

    private int maxCoperti;

    private TableStaus tableStaus;

    public Tavolo(@Value("1") int tavoloId, @Value("5") int maxCoperti, @Value("LIBERO") TableStaus tableStaus) {
        Random rndm = new Random();
        this.tavoloId = rndm.nextInt(1, 100);
        this.maxCoperti = maxCoperti;
        this.tableStaus = tableStaus;
    }
}


