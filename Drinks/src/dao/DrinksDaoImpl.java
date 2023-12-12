package dao;

import model.Drink;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DrinksDaoImpl extends Dao implements DrinksDao{

    /**
     * 查询
     * @return
     * @throws Exception
     */
    @Override
    public List<Drink> queryDrinks() throws Exception {
        Connection conn = getConnection();
        String sql = "select * from t_drinks";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Drink> list = new ArrayList<>();
        while (rs.next()){
            Drink drink = new Drink();
            drink.setBand(rs.getString("band"));
            drink.setOrigin(rs.getString("origin"));
            drink.setCap(rs.getString("cap"));
            drink.setType(rs.getString("type"));
            drink.setPrice(rs.getDouble("price"));
            list.add(drink);
        }
        ps.close();
        rs.close();
        return list;
    }

    /**
     * 增加
     * @param drink
     * @throws Exception
     */
    @Override
    public void addDrinks(Drink drink) throws Exception {
        Connection conn = getConnection();
        String sql = "insert into t_drinks VALUES (?,?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, drink.getBand());
        ps.setString(2, drink.getOrigin());
        ps.setString(3, drink.getCap());
        ps.setString(4,drink.getType());
        ps.setDouble(5,drink.getPrice());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    /**
     * 修改
     * @param drink
     * @throws Exception
     */
    @Override
    public void updateDrinks(Drink drink) throws Exception {
        Connection conn = getConnection();
        String sql = "update t_drinks set cap = ? ,price = ? where band = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,drink.getCap());
        ps.setDouble(2,drink.getPrice());
        ps.setString(3,drink.getBand());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    @Override
    public void delDrinks(String band) throws Exception {
        Connection conn = getConnection();
        String sql = "delete from t_drinks where band = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,band);
        ps.executeUpdate();
        ps.close();
        conn.close();
    }


}
