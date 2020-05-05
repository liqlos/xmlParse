package database;

import java.sql.*;

public class SqliteConnection{

    private static final String CONNECTION_URL = "jdbc:sqlite:src\\main\\resources\\order.db";

    private static Connection connection;
    private static Statement statement;
    private static boolean isOpen = false;

    private static final String DOC_TYPES_INSERT_SQL = "INSERT INTO doctypes(document_type) VALUES(?)";
    private static final String CREATE_TABLE_SQL ="create table if not exists doctypes(id integer primary key, document_type varchar(70) not null)";


    public static void open()
    {
        if(!isOpen) {
            try {
                connection = DriverManager.getConnection(CONNECTION_URL);
                statement = connection.createStatement();
                isOpen = true;
            } catch (SQLException sql) {
                isOpen = false;
                System.out.println();
                System.out.println("------ОШИБКА------");
                System.out.println("Сообщение - " + sql);
                System.out.println("StackTrace - " + sql.getStackTrace());
            }
        }
    }

    public static void close()
    {
        try {
            statement.close();
            connection.close();
            isOpen = false;
        }
        catch (SQLException sql)
        {
            System.out.println();
            System.out.println("------ОШИБКА------");
            System.out.println("Сообщение - " + sql);
            System.out.println("StackTrace - " + sql.getStackTrace());
        }
    }


    public static void insertDocType(String docType) {
        PreparedStatement insertStatement = null;
        try {
            statement.execute(CREATE_TABLE_SQL);
            insertStatement = connection.prepareStatement(DOC_TYPES_INSERT_SQL);
            insertStatement.setString(1, docType);
            insertStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            close();
        }
    }

}
