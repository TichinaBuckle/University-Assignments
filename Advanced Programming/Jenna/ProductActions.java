package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class ProductActions {

    private static Statement statement;
    private static ResultSet resultSet;
    private static Connection connection = DbConn.getConnection();

    public static void addAProduct(Product product) throws SQLException {
        String insertQuery = "INSERT INTO products (stockId, name, description, price) VALUES ('" + product.getStockId() + "', '" + product.getName() + "', '" + product.getDescription() + "', " + product.getPrice() + ")";
        statement = connection.createStatement();
        statement.executeUpdate(insertQuery);
    }

    public static Product findAProduct(String stockId) throws SQLException {
        String selectQuery = "SELECT * FROM products WHERE stockId='" + stockId + "'";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(selectQuery);

        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String description = resultSet.getString("description");
            float price = resultSet.getFloat("price");
            Product product = new Product(stockId, name, description, price);
            return product;
        } else {
            return null;
        }
    }

    public static void updateAProduct(String stockId, float price) throws SQLException {
        String updateQuery = "UPDATE products SET price=" + price + " WHERE stockId='" + stockId + "'";
        statement = connection.createStatement();
        statement.executeUpdate(updateQuery);
    }

    public static void deleteAProduct(String stockId) throws SQLException {
        String deleteQuery = "DELETE FROM products WHERE stockId='" + stockId + "'";
        statement = connection.createStatement();
        statement.executeUpdate(deleteQuery);
    }

    public static List<Product> getAllProducts() throws SQLException {
        List<Product> products = new ArrayList<Product>();
        String selectQuery = "SELECT * FROM products";
        statement = connection.createStatement();
        resultSet = statement.executeQuery(selectQuery);

        while (resultSet.next()) {
            String stockId = resultSet.getString("stockId");
            String name = resultSet.getString("name");
            String description = resultSet.getString("description");
            float price = resultSet.getFloat("price");
            Product product = new Product(stockId, name, description, price);
            products.add(product);
        }

        return products;
    }

    // getters and setters for the Statement, ResultSet, and Connection attributes
    public static Statement getStatement() {
        return statement;
    }

    public static void setStatement(Statement statement) {
        ProductActions.statement = statement;
    }

    public static ResultSet getResultSet() {
        return resultSet;
    }

    public static void setResultSet(ResultSet resultSet) {
        ProductActions.resultSet = resultSet;
    }

    public static Connection getConnection() {
        return connection;
    }

    public static void setConnection(Connection connection) {
        ProductActions.connection = connection;
    }
}
}
