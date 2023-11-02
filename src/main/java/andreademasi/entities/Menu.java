package andreademasi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter

public class Menu {
    private List<Pizze> pizze;
    private List<Toppings> toppings;
    private List<Bevande> bevande;

    @Override
    public String toString() {
        return "{" + pizze + "\n" + toppings + "\n" + bevande + '}';
    }
}
