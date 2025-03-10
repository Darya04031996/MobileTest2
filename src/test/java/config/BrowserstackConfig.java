package config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:host/${deviceHost}.properties"
})

public interface BrowserstackConfig extends Config {
    String browserstackUser();
    String browserstackKey();
    String app();
    String device();
    String osVersion();
    String projectName();
    String buildName();
    String name();
    String browserstackUrl();
    String locale();
    String language();

}

