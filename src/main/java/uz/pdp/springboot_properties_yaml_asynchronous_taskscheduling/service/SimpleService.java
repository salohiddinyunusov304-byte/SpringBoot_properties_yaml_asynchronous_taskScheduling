package uz.pdp.springboot_properties_yaml_asynchronous_taskscheduling.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class SimpleService {

//    private void hello() {
//        sendMessage(); // bu holatda sendMessage() asynchrone ishlamaydi
//    }
    @Async
    public void sendMessage() {

       log.info("sendMessage is starting. Time: {}", new Date());

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        log.info("sendMessage is send. Time: {}", new Date());
        throw new RuntimeException("Xatolik sodir boldi...");
    }
}
