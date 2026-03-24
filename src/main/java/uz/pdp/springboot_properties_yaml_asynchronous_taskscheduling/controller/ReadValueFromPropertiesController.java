package uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @Value("${example.string:Default string..}")
    private String exampleString;

    @GetMapping("/exapleString")
    public String getExampleString() {
        return exampleString;
    }

    @Value("${example.languages}")
    private List<String> examplelanguages;

    @GetMapping("/exapleLanguages")
    public List<String> getExampleLanguages() {
        return examplelanguages;
    }

    @Value("#{'${example.languages2}'.split('# ')}")
    private List<String> examplelanguages2;

    @GetMapping("/excampleLanguages2")
    public List<String> getExamplelanguages2() {
        return examplelanguages2;
    }

    @Value("#{${example.numbers}}")
    private Map<String, Integer> exampleNumbers;

    @GetMapping("/exapleNumbers")
    public Map<String, Integer> getExampleNumbers() {
        return exampleNumbers;
    }

    @GetMapping("/person")
    public PersonProperties getPerson() {
        return personProperties;
    }

    @GetMapping("/people")
    public PeopleProperties getPeople() {
        return peopleProperties;
    }
}
