package com.wyzard.main;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("application.xml");
        ComboPooledDataSource cpds = (ComboPooledDataSource) ctx.getBean("dataSource");
        System.out.println(cpds.getConnection());
    }
}
