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

}
