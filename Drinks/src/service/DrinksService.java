package service;

import model.Drink;

import java.util.List;

public interface DrinksService {

    public List<Drink> queryDrinks() throws Exception;
    public void addDrinks(Drink drink) throws Exception;
}
