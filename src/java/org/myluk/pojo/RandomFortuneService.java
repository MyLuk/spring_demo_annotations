package org.myluk.pojo;

import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "Beware  of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    public String getFortune() {
        return data[new Random().nextInt(data.length)];
    }
}
