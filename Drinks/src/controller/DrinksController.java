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

    /**
     * 增加
     * @param drink
     * @throws Exception
     */
    public void addDrinks(Drink drink) throws Exception{
        drinksService = new DrinksServiceImpl();
        try{
            drinksService.addDrinks(drink);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * 修改
     * @param drink
     * @throws Exception
     */
    public void updateDrinks(Drink drink) throws Exception{
        drinksService = new DrinksServiceImpl();
        try{
            drinksService.updateDrinks(drink);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void delDrinks(String band) throws Exception{
        drinksService = new DrinksServiceImpl();
        try {
            drinksService.delDrinks(band);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
