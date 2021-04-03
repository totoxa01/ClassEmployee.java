package ru.geekbrains.lesson9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 03.04.2021
 */
public class DatabaseExample {
    private static Connection connection; //подключение
    private static Statement statement; //запрос в БД

    public static void main(String[] args) {
        try {
            connect();
            dropCreate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            disconnect();
        }
    }

    private static void dropCreate() throws SQLException {
        statement.execute("drop table if exists studens;");
        statement.execute("create table if not exists studens (id integer primary key autoincrement, name text, score integer);");
    }

    private static void disconnect(){
        try{
            if(statement != null)
                statement.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }

        try{
            if(connection != null){
                connection.close();
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }


    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC"); //загружаем класс JDBC в память и регистрируем драйвер
        connection = DriverManager.getConnection("jdbc:sqlite:students.db"); //строка подключения к БД
        statement = connection.createStatement();
    }
}
