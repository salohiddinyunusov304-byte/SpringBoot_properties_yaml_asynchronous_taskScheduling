package uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.property;

import java.util.UUID;

public record PersonDto(
        UUID id,
        String firstName,
        String lastName,
        String fullName,
        Integer age
) {
}
