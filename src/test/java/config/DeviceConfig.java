package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${deviceHost}.properties"
})
public interface DeviceConfig extends Config {

    String app();
    String device();
    String project();
    String version();
    String build();
    String name();
    String url();
    String language();
    String locale();
}