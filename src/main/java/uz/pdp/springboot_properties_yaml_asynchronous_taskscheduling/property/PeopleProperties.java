package uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "people")
public record PeopleProperties(
        List<PersonProperties> person
) {
}
