package gb.intermediate.controller;

import gb.intermediate.model.Basket;
import gb.intermediate.model.Fruits;
import gb.intermediate.model.FruitsBasket;
import gb.intermediate.view.*;

/**
 * Контроллер<br>
 * Метод <strong>run()</strong> для запуска приложения
 */
public class Controller {
    private Calculate<Basket> calculate;
    private Basket<Fruits> basket;
    private static final String promptMenu = "1. Показать корзину для пикника%n"+
            "2. Показать сколько всего фруктов (слов) в корзине%n"+
            "3. Показать самое длинное название фрукта в корзине%n"+
            "4. Показать самые популярные фрукты в корзине%n"+
            "5. Показать самые не популярные фрукты в корзине%n"+
            "0. Выйти из приложения%n"+
            "Ваш выбор: ";
    private GetChoice getChoice;

    public Controller() {
        basket = new FruitsBasket(new LoadFruitsFromFile("input.txt").getRawFruits());
    }

    public void run(){
        int command = 10;
        getChoice = new GetChoice();
        while (command!=0){
            command = getChoice.getIntChoice(promptMenu);
            calculate = switch (command) {
                case 1 -> new CalculateAllFruitsInBasket();
                case 2 -> new CalculateCountFruits();
                case 3 -> new CalculateLongestFruitName();
                case 4 -> new CalculateRateFruitAtPicnic(false);
                case 5 -> new CalculateRateFruitAtPicnic(true);
                default -> null;
            };
            if (calculate!=null) calculate.calculate(basket);
        }
        getChoice.close();

    }
}
