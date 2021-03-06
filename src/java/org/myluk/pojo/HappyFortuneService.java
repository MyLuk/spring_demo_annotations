package org.myluk.pojo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is your lucky day";
    }

    public HappyFortuneService() {
        System.out.println("Happy service");
    }
}
