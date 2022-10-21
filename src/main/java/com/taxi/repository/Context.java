package com.taxi.repository;

import com.taxi.client.Client;
import com.taxi.driver.Driver;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class Context {
    public static Driver CURRENT_DRIVER;
    public static Client CURRENT_CLIENT;
    public static DataSource DataSource = createDataSource();

    public static DataSource getDataSource() {
        return DataSource;
    }

    public static void setCurrentDriver(Driver currentDriver) {
        CURRENT_DRIVER = currentDriver;
    }

    public static void setCurrentClient(Client currentClient) {
        CURRENT_CLIENT = currentClient;
    }

    private static DataSource createDataSource() {
        // The url specifies the address of our database along with username and password credentials
        // you should replace these with your own username and password
        final String url =
                "jdbc:postgresql://localhost:5004/postgres?user=postgres&password=postgres";
        final PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUrl(url);
        return dataSource;
    }
}




