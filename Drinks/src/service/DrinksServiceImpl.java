package service;

import dao.DrinksDao;
import dao.DrinksDaoImpl;
import model.Drink;

import java.util.List;

public class DrinksServiceImpl implements DrinksService{

    private DrinksDao drinksDao;
    /**
     * 查询
     * @return
     * @throws Exception
     */
    @Override
    public List<Drink> queryDrinks() throws Exception {
        drinksDao = new DrinksDaoImpl();
        return drinksDao.queryDrinks();
    }


    /**
     * 增加
     * @param
     * @throws Exception
     */
    @Override
    public void addDrinks(Drink drink) throws Exception {
        drinksDao = new DrinksDaoImpl();
        drinksDao.addDrinks(drink);
    }

    @Override
    public void updateDrinks(Drink drink) throws Exception {
        drinksDao = new DrinksDaoImpl();
        drinksDao.updateDrinks(drink);
    }

    @Override
    public void delDrinks(String band) throws Exception {
        drinksDao = new DrinksDaoImpl();
        drinksDao.delDrinks(band);
    }


}
