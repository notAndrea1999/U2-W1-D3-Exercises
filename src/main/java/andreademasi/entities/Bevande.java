package andreademasi.entities;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Bevande extends ElementiMenu {


    public Bevande(String name, int kcal, double price) {
        super(name, kcal, price);
    }

  
}


