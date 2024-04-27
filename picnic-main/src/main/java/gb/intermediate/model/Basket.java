package gb.intermediate.model;

import java.util.Map;

public interface Basket<T> extends Iterable<T>{
    int getBasketSize();
    void addToBasket(T plant);
    Integer getPlantAmount(T plant);

    Map<T, Integer> getBasket();
}
