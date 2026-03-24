package uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "example")
public record ExempleProperties(
        String string,
        List<String> languages,
        List<String> languages2,
        Map<String, Integer> numbers
) {
}
