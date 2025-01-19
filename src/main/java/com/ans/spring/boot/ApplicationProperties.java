package com.ans.spring.boot;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app")
@Validated
public class ApplicationProperties {

    //it should be same present in application.properties file
    String version;
    @NotEmpty
    String author;
    DataSource datasource;

//    @Override
//    public String toString() {
//        return "ApplicationProperties{" +
//                "version='" + version + '\'' +
//                ", author='" + author + '\'' +
//                ", datasource=" + datasource +
//                '}';
//    }

    public DataSource getDatasource() {
        return datasource;
    }

    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static class DataSource{

        @NotEmpty
        String url;
        @NotEmpty
        String driverClassName;
        @NotEmpty
        String username;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getDriverClassName() {
            return driverClassName;
        }

        public void setDriverClassName(String driverClassName) {
            this.driverClassName = driverClassName;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        @Override
        public String toString() {
            return "DataSoruce{" +
                    "url='" + url + '\'' +
                    ", driverClassName='" + driverClassName + '\'' +
                    ", username='" + username + '\'' +
                    '}';
        }
    }
}
