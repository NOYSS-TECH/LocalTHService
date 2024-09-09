package com.app.localthservice.config.startup;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.name}")
    private String appName;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        ParameterStartup.appVersion = appVersion;
        ParameterStartup.appName = appName;

        LOGGER.info("name : {}", appName);
        LOGGER.info("version : {}", appVersion);
    }
}
