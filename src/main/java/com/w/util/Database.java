package com.w.util;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Creat with IntelliJ IDEA.
 * Description:
 * User: WHM
 * Date: 2020-01-15
 * Time: 16:19
 */
public class Database {
    private static DataSource connection = null;

    static {
        MysqlConnectionPoolDataSource mysqlDataSource = new MysqlConnectionPoolDataSource();
        mysqlDataSource.setServerName("localhost");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("root");
        mysqlDataSource.setDatabaseName("blog_20200115");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");

        connection = mysqlDataSource;
    }

    public static Connection getConnection() throws SQLException {
        return connection.getConnection();
    }
}

