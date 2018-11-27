package org.myluk.pojo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SadFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is a sad day";
    }

    public SadFortuneService() {
        System.out.println("Sad service");
    }
}
