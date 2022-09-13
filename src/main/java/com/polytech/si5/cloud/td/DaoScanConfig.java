package com.polytech.si5.cloud.td;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration("daoScanConfig")
@ComponentScan(basePackages = "com.polytech.si5.cloud.td.*")
@EntityScan(basePackages = "com.polytech.si5.cloud.td.*")
@EnableJpaRepositories("com.polytech.si5.cloud.td.*")
public class DaoScanConfig {
}
