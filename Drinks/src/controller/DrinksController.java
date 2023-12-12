package controller;

import model.Drink;
import service.DrinksService;
import service.DrinksServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class DrinksController {

    private DrinksService drinksService;

    /**
     * 查询
     * @return
     */

    public List<Drink> queryDrinks(){
        drinksService = new DrinksServiceImpl();
        List<Drink> list = new ArrayList<>();
        try{
            list = drinksService.queryDrinks();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}
