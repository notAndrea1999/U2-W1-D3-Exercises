package andreademasi.entities;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Toppings extends ElementiMenu {

    public Toppings(String name, int kcal, double price) {
        super(name, kcal, price);
    }

    @Override
    public String toString() {
        return "Toppings: " + super.toString();
    }
}
