package gb.intermediate.view;

import gb.intermediate.model.Basket;
import gb.intermediate.model.Fruits;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для вывода на консоль содержимого всей корзины
 */
public class CalculateAllFruitsInBasket implements Calculate<Basket> {
    @Override
    public void calculate(Basket basket) {
        List<String> allFruits = getAllFruitsFromBasket(basket);
        for (String fruit: allFruits) System.out.println(fruit);

    }


    private List<String> getAllFruitsFromBasket(Basket<Fruits> basket) {
        List<String> result = new ArrayList<>();
        for (Fruits fruit : basket) {
            result.add(String.format("%s - %s шт.", fruit.getName(), basket.getPlantAmount(fruit)));

        }
        return result;
    }
}
