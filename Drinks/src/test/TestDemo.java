package test;

import controller.DrinksController;
import model.Drink;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestDemo {

    private DrinksController drinksController;

    @Before
    public void init(){drinksController = new DrinksController();}

    @Test
    public void testQuery(){
        List<Drink> list = drinksController.queryDrinks();
        list.forEach(drink -> System.out.println(drink));
    }

    @Test
    public void testAdd() throws Exception {
        Drink drink = new Drink();
        drink.setBand("茅台");
        drink.setOrigin("贵州");
        drink.setType("酒");
        drink.setCap("700ml");
        drink.setPrice(3000);
        drinksController.addDrinks(drink);
    }

    @Test
    public void testUpadte() throws Exception {
        Drink drink = new Drink();
        drink.setBand("百事");
        drink.setCap("1L");
        drink.setPrice(6);
        drinksController.updateDrinks(drink);
    }

    @Test
    public void testDel() throws Exception{
        Drink drink = new Drink();
        drink.setBand("茅台");
        drinksController.delDrinks(drink.getBand());
    }
}
