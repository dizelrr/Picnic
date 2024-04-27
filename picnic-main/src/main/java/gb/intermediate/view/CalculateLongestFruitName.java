package gb.intermediate.view;

import gb.intermediate.model.Basket;
import gb.intermediate.model.Fruits;
import gb.intermediate.model.FruitsComparator;

import java.util.Optional;

/**
 * Класс для вывода самого длинного названия фрукта в корзине
 */
public class CalculateLongestFruitName implements Calculate<Basket>{

    @Override
    public void calculate(Basket basket) {
        Optional<Fruits> maxFruit = basket.getBasket().keySet().stream().max(new FruitsComparator());
        System.out.printf("Самое длинное название - %s, его длина %s символов%n", maxFruit.get().getName(),maxFruit.get().getNameLength());
    }
}
