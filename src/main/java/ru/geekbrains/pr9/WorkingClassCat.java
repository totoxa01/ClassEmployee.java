package ru.geekbrains.pr9;

import java.sql.*;
import java.util.Scanner;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 03.04.2021
 */
public class WorkingClassCat{
    private static Connection connection; //подключение
    private static Statement statement; //запрос в БД
    private static PreparedStatement ps; //подготовкленный запрос

    public static void main(String[] args) {
        try {
            connect();
            createCat();
            editCat();
            readCat();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void createCat() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Сколько котов будете добавлять?");
            int count = scanner.nextInt();
            prepareStatement();
            for (int i = 1; i <= count; i++){
                System.out.print("Введите имя " + i + " кота: ");
                String name = scanner.next();

                System.out.print("Введите цвет " + i + " кота: ");
                String colour = scanner.next();

                System.out.print("Введите возраст " + i + " кота: ");
                int age = scanner.nextInt();

                System.out.print("Введите породу " + i + " кота: ");
                String breed = scanner.next();

                ps.setString(1,name);
                ps.setString(2,colour);
                ps.setInt(3,age);
                ps.setString(4,breed);
                ps.executeUpdate();

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            disconnect();
        }
    }

    private static void readCat(){
        try(ResultSet rs = statement.executeQuery("SELECT nameCat, ageCat FROM cat")){
            while (rs.next()){
                System.out.printf("Cat: %s >>>>>>> %d \n",
                        rs.getString("nameCat"),
                        rs.getInt("ageCat"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void editPrepareStatement() throws SQLException {
        ps = connection.prepareStatement("update cat set breed = ? where idCat = ?");
    }

    private static void editCat(){
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.println("Введите ID изменяемой строки");
//            int idCat = scanner.nextInt();
//            System.out.println("Введите породу");
//            String breed = scanner.next();
//            editPrepareStatement();
//            ps.setString(2,breed);
//            ps.setInt(1,idCat);
//            ps.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }


        try {
            int upd = statement.executeUpdate("update cat set breed = 'британец' where idCat = 3");
            System.out.println("Updated: " + upd);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    private static void disconnect(){
        try{
            if(statement != null)
                statement.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        try{
            if(ps != null)
                ps.close();
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

    private static void prepareStatement() throws SQLException {
        ps = connection.prepareStatement("INSERT INTO cat (nameCat, colourCat, ageCat, breed) VALUES (?, ?, ?, ?)");
    }

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC"); //загружаем класс JDBC в память и регистрируем драйвер
        connection = DriverManager.getConnection("jdbc:sqlite:students.db"); //строка подключения к БД
        statement = connection.createStatement();
    }



}
