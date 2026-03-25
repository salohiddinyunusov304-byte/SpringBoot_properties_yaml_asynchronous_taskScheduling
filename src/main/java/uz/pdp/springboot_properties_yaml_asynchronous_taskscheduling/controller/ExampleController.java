package uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.service.SimpleService;

@RestController
@RequestMapping("/example")
@RequiredArgsConstructor
public class ExampleController {
    private final SimpleService simpleService;

    @GetMapping("/sendMessage")
    public String sendMessage() throws InterruptedException {
        simpleService.sendMessage();
        return "Xabar jonatildi...";
    }
}
