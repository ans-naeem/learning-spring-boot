package com.ans.spring.boot;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Validated
public record ApplicationProperties (
    @NotEmpty  String version,
    @NotEmpty  String author,
    DataSource datasource){

    public record DataSource(
            @NotEmpty String url,
            @NotEmpty String driverClassName,
            @NotEmpty String username)
    { }
}
