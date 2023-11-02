package andreademasi;

import andreademasi.entities.Bevande;
import andreademasi.entities.Menu;
import andreademasi.entities.Pizze;
import andreademasi.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    Bevande getLemonade() {
        return new Bevande("Lemonade", 128, 1.29);
    }

    Bevande getWater() {
        return new Bevande("Water", 128, 1.29);
    }

    Bevande getWine() {
        return new Bevande("Wine", 128, 1.29);
    }

    @Bean
    Toppings getCheese() {
        return new Toppings("Cheese", 92, 0.69);
    }

    @Bean
    Toppings getTomato() {
        return new Toppings("Tomato", 92, 0.69);
    }

    @Bean
    Toppings getHam() {
        return new Toppings("Ham", 35, 0.69);
    }

    @Bean
    Toppings getOnions() {
        return new Toppings("Onions", 22, 0.69);
    }

    @Bean
    Toppings getPineapple() {
        return new Toppings("Pineapple", 24, 0.69);
    }

    @Bean
    Toppings getSalami() {
        return new Toppings("Salami", 86, 0.69);
    }

    @Bean
    Pizze getMargherita() {
        List<String> toppingsList = new ArrayList<>();
        toppingsList.add(getTomato().getName());
        toppingsList.add(getCheese().getName());
        return new Pizze("Margherita", toppingsList, 1104, 4.99);
    }

    @Bean
    Pizze getHawaiianPizza() {
        List<String> toppingsList = new ArrayList<>();
        toppingsList.add(getTomato().getName());
        toppingsList.add(getCheese().getName());
        toppingsList.add(getHam().getName());
        toppingsList.add(getPineapple().getName());
        return new Pizze("Hawaiian Pizza", toppingsList, 1104, 4.99);
    }

    @Bean
    Pizze getSalamiPizza() {
        List<String> toppingsList = new ArrayList<>();
        toppingsList.add(getTomato().getName());
        toppingsList.add(getCheese().getName());
        toppingsList.add(getSalami().getName());
        return new Pizze("Salami Pizza", toppingsList, 1104, 4.99);
    }

    @Bean
    @Scope("prototype")
    Menu getMenu() {
        List<Pizze> pizzeList = new ArrayList<>(Arrays.asList(getMargherita(), getHawaiianPizza(), getSalamiPizza()));
        List<Toppings> toppingsList = new ArrayList<>(Arrays.asList(getCheese(), getHam(), getOnions(), getPineapple(), getSalami()));
        List<Bevande> drinkList = new ArrayList<>(Arrays.asList(getLemonade(), getWater(), getWine()));
        return new Menu(pizzeList, toppingsList, drinkList);
    }


}
