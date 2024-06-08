package org.blockchainJava.standardway;

import org.blockchainJava.standardway.studentdao.StudentDao;
import org.blockchainJava.standardway.studentdao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class JavaConfig {
    @Bean(name = {"ds"})
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://Localhost:3306/jdbc");
        ds.setUsername("root");
        ds.setPassword("Maveric");
        return ds;
    }
    @Bean(name={"jdbcTemplate"})
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }
    @Bean(name = {"studentDao"})
    public StudentDao getStudentDao(){
        StudentDaoImpl studentDao=new StudentDaoImpl();
        studentDao.setJdbcTemplate(getJdbcTemplate());
        return studentDao;
    }
}
