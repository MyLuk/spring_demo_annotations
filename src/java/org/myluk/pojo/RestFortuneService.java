package org.myluk.pojo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is your lucky day";
    }
}
