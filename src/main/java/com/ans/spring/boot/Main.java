package com.ans.spring.boot;


import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@EnableCaching
@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class,args);

//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}

@Component
class Appinitializer implements CommandLineRunner{

    @Value("${app.version}")
    private String appversion;

    @Autowired
    public ApplicationProperties property;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("The app version is "+appversion);

        System.out.println("The app.datasource values are "+property);

    }
}