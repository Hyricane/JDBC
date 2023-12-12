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
        drink.setBand("崂山可乐");
        drink.setOrigin("青岛");
        drink.setType("碳酸饮料");
        drink.setCap("500ml");
        drink.setPrice(2.4);
        drinksController.addDrinks(drink);
    }

    @Test
    public void testUpadte() throws Exception {
        Drink drink = new Drink();
        drink.setBand("百事");
        drink.setCap("500ml");
        drink.setPrice(3);
        drinksController.updateDrinks(drink);
    }

    @Test
    public void testDel() throws Exception{
        Drink drink = new Drink();
        drink.setBand("美汁源");
        drinksController.delDrinks(drink.getBand());
    }
}
