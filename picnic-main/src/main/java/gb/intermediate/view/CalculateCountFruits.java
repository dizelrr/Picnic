package gb.intermediate.view;

import gb.intermediate.model.Basket;

/**
 * Класс для вывода на консоль количества фруктов в корзине
 */
public class CalculateCountFruits implements Calculate<Basket> {

    @Override
    public void calculate(Basket basket) {
        System.out.printf("Всего фруктов - %s%n", basket.getBasketSize());
    }
}
