package com.supermarket_sys.tool.db;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class TestDB {

    @Test
    public void testDBCP() throws PropertyVetoException, SQLException {

        BasicDataSource dataSource = null;
        dataSource = new BasicDataSource();

        dataSource.setUsername("root");
        dataSource.setPassword("111111");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        //数据库初始化连接数
        dataSource.setInitialSize(10);
        //指定最大连接数：同一时间可以向数据库申请的连接数
        dataSource.setMaxActive(50);
        //指定最小连接数：数据库连接池中保存的最少的空闲连接数
        dataSource.setMinIdle(5);
        //等待数据库连接池分配连接的最长时间。单位毫秒。超出时间抛异常。
        dataSource.setMaxWait(1000);



        //获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection.getClass());
    }

    @Test
    public void testDBCPWithDataSourceFactory() throws Exception {
        Properties properties = new Properties();
        InputStream inputStream = TestDB.class.getClassLoader().getResourceAsStream("dbcp.properties");
        properties.load(inputStream);

        DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);

        System.out.println(dataSource.getConnection());

        BasicDataSource basicDataSource = (BasicDataSource) dataSource;
        System.out.println(basicDataSource.getMaxWait());
    }

    @Test
    public void testC3P0() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUser("root");
        dataSource.setPassword("111111");
        System.out.println(dataSource.getConnection());

    }

    @Test
    public void testC3P0WithConfigFile() throws SQLException {
        DataSource dataSource = new ComboPooledDataSource("helloc3p0");

        System.out.println(dataSource.getConnection());

        ComboPooledDataSource comboPooledDataSource = (ComboPooledDataSource) dataSource;
        System.out.println(comboPooledDataSource.getMaxStatements());
    }
}
