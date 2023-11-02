package andreademasi.entities;

import lombok.Getter;

@Getter
public abstract class ElementiMenu {
    private String name;
    private int kcal;
    private double price;

    public ElementiMenu(String name, int kcal, double price) {
        this.name = name;
        this.kcal = kcal;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElementiMenu{" +
                "name='" + name + '\'' +
                ", kcal=" + kcal +
                ", price=" + price +
                '}';
    }
}
