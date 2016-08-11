package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ryanjbaxter on 8/10/16.
 */
@Configuration
@ConfigurationProperties(prefix = "mine")
public class MineProperties {

    @Value("${spring.cloud.config.uri:http://localhost:8888}")
    private String configServerUrl;

    private Mine[] mines;

    public String getConfigServerUrl() {
        return configServerUrl;
    }

    public void setConfigServerUrl(String configServerUrl) {
        this.configServerUrl = configServerUrl;
    }

    public Mine[] getMines() {
        return mines;
    }

    public void setMines(Mine[] mines) {
        this.mines = mines;
    }

}


