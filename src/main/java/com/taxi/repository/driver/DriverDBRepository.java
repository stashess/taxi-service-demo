package com.taxi.repository.driver;

import com.taxi.delivery.Delivery;
import com.taxi.driver.CarClass;
import com.taxi.driver.Driver;
import com.taxi.input.InputUtils;
import com.taxi.repository.Context;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DriverDBRepository {

    public static List<Driver> getAll() {
        List<Driver> drivers = new ArrayList<>();

        DataSource dataSource = Context.getDataSource();
        Connection connection = null;
        try {
            connection = dataSource.getConnection();

            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM drivers");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String type = rs.getString("type");
                String dType = rs.getString("delivery_type");
                CarClass carClass = null;
                if (type != null){
                    carClass = CarClass.valueOf(type);
                }
                Delivery deliveryType = null;
                if (dType != null){
                    deliveryType = Delivery.valueOf(dType);
                }
                Driver driver = new Driver();
                driver.setId(id);
                driver.setName(name);
                driver.setDeliveryType(deliveryType);
                driver.setType(carClass);
                drivers.add(driver);
            }
        } catch (Exception e){

        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return drivers;
    }

    public static List<Driver> showAndReturnDriversList() {
        List<Driver> all = getAll();
        for (Driver driver : all) {
            System.out.println(driver.getId() + " | " + driver);
        }
        System.out.println("Total drivers : " + all.size());
        return all;
    }
}
