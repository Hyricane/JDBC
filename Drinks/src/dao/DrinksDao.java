package dao;

import model.Drink;

import java.util.List;

public interface DrinksDao {
    public List<Drink> queryDrinks() throws Exception;
    public void addDrinks(Drink drink) throws Exception;
    public void updateDrinks(Drink drink) throws Exception;
    public void delDrinks(String band) throws Exception;
}
