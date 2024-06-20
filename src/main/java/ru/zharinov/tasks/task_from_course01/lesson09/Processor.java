package ru.zharinov.tasks.task_from_course01.lesson09;

import ru.zharinov.tasks.task_from_course01.lesson09.annotation.Column;
import ru.zharinov.tasks.task_from_course01.lesson09.annotation.Table;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Processor {
    private static Connection connection;
    private static Statement statement;

    public static void connect() throws SQLException {
        try {
            Class.forName("org.postgres.JDBC");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Unable to connect");
        }
    }

    public static void buildTable(Class<?> clazz) throws SQLException {
        if (!clazz.isAnnotationPresent(Table.class)) {
            throw new RuntimeException("@Table missed");
        }
        Map<Class<?>, String> map = new HashMap<>();
        map.put(int.class, "INTEGER");
        map.put(String.class, "TEXT");
        // CREATE TABLE cats (id INTEGER, name TEXT, age INTEGER)
        StringBuilder stringBuilder = new StringBuilder("CREATE TABLE");
        // 'CREATE TABLE '
        stringBuilder.append(clazz.getAnnotation(Table.class).title());
        // 'CREATE TABLE cats'
        stringBuilder.append(" (");
        var declaredField = clazz.getDeclaredFields();
        for (Field field : declaredField) {
            if (field.isAnnotationPresent(Column.class)) {
                stringBuilder.append(field.getName())
                        .append(" ")
                        .append(map.get(field.getType()))
                        .append(", ");
            }
        }
        // 'CREATE TABLE cats (id INTEGER, name TEXT, age INTEGER, '
        stringBuilder.setLength(stringBuilder.length() - 2);
        // 'CREATE TABLE cats (id INTEGER, name TEXT, age INTEGER'
        stringBuilder.append(");");
        // 'CREATE TABLE cats (id INTEGER, name TEXT, age INTEGER);'
        statement.executeUpdate(stringBuilder.toString());
    }


    public static void disconnect() {
        try {
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
