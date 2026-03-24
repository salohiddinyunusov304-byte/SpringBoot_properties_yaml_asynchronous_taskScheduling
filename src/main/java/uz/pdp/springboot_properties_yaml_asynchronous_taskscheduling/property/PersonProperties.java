package uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "person")
public record PersonProperties(
        Integer id,
        String firstName,
        String lastName,
        String fullName,
        Integer age
) {
}
