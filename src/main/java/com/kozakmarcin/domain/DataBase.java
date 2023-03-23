package com.kozakmarcin.domain;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase implements DataReadable{
    @Override
    public List<String> getData() throws NullPointerException{
        List<String> romanExpressions = new ArrayList<>();
        String sqlSelectAllRomanianExpressions = "SELECT expression FROM roman_expressions";
        String connectionUrl = "jdbc:mysql://localhost:3306/roman_numbers";

        try(Connection connection = DriverManager.getConnection(connectionUrl, "root", "marcin");
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelectAllRomanianExpressions);
            ResultSet resultSet = preparedStatement.executeQuery()){
            while (resultSet.next()){
               romanExpressions.add(resultSet.getString("expression"));
            }

        } catch (SQLException e){
            System.out.println("Błąd przy połączeniu z bazą danych");
        }
        return romanExpressions;
    }
}
