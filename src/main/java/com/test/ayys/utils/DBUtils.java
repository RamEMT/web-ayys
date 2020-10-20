package com.test.ayys.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    private static volatile DBUtils instance = null;
    private static DataSource ds;
    private final static String DB_PROPERTIES_NAME = "jdbc.properties";

    static {
        try {
            //创建连接池
            Properties properties = new Properties();
            properties.load(DBUtils.class.getClassLoader().getResourceAsStream(DB_PROPERTIES_NAME));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //单例模式
    public static DBUtils getInstance() {
        if (instance == null) {
            synchronized (DBUtils.class) {
                if (instance == null) {
                    instance = new DBUtils();
                }
            }
        }
        return instance;
    }

    /**
     * 获取连接操作
     * @return 连接对象
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            //加载驱动
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 释放所有资源的方法
     * @param closeables 资源参数
     */
    public static void closeAll(AutoCloseable... closeables) {
        for (AutoCloseable ac : closeables) {
            if (ac != null) {
                try {
                    ac.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
