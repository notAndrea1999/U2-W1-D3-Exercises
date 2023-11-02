package andreademasi.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Pizze extends ElementiMenu {

    private List<String> toppings;

    public Pizze(String name, List<String> toppings, int kcal, double price) {
        super(name, kcal, price);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "toppings=" + toppings +
                "} " + super.toString();
    }
}

