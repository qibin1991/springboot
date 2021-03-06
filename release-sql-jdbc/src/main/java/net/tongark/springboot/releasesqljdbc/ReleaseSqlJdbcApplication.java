package net.tongark.springboot.releasesqljdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ReleaseSqlJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReleaseSqlJdbcApplication.class, args);
    }

}
