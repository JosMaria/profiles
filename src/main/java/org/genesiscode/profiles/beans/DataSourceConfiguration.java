package org.genesiscode.profiles.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:datasource.properties")
public class DataSourceConfiguration {

    @Bean
    public DataSource dataSource(@Value("${datasource.username}") String username,
                                 @Value("${datasource.password}") String password) {
        DataSource dataSource = new DataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
