package pl.bartekk.engapp;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfiguration {

    @Bean
    public DataSource dataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("engapp");
        dataSource.setUser("root");
        dataSource.setPassword("password");
        dataSource.setEncoding("UTF-8");
        return dataSource;
    }
}
