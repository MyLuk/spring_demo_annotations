package org.myluk.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class SwimCoach implements Coach {

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Value("${foo.email}")
    private String email;

    @Value("${team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private FortuneService fortuneService;


    public String getDailyWorkout() {
        return "Swim fast as you can";
    }

    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
