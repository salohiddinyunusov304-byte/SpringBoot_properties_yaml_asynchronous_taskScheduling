package uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.property.ExempleProperties;
import uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.property.PeopleProperties;
import uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.property.PersonProperties;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/properties")
@RequiredArgsConstructor
public class ReadValueFromPropertiesController {
    private final PersonProperties personProperties;
    private final PeopleProperties peopleProperties;
    private final ExempleProperties exempleProperties;

//    @Value("#{${example.numbers}}")
//    private Map<String, Integer> exampleNumbers;
//
//    @GetMapping("/exampleNumbers")
//    public Map<String, Integer> getExampleNumbers() {
//        return exampleNumbers;
//    }

    @GetMapping("/person")
    public PersonProperties getPerson() {
        return personProperties;
    }

    @GetMapping("/people")
    public PeopleProperties getPeople() {
        return peopleProperties;
    }

    @GetMapping("/exampleString")
    public String getExample() {
        return exempleProperties.string();
    }

    @GetMapping("/exampleLanguages")
    public List<String> getExampleLanguage() {
        return exempleProperties.languages();
    }

    @GetMapping("/exampleLanguages2")
    public List<String> getExampleLanguage2() {
        return exempleProperties.languages2();
    }

    @GetMapping("/exampleNumbers")
    public Map<String, Integer> getExampleNumbers() {
        return exempleProperties.numbers();
    }
}
