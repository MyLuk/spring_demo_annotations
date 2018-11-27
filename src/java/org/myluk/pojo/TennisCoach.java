package org.myluk.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("sillyCoach")
@Lazy
public class TennisCoach implements Coach {
    @PostConstruct
    private void postConstruct() {
        System.out.println("After construction");
    }

    public TennisCoach() {
        System.out.println("tennis coach");
    }

    @PreDestroy
    private void postDestroy() {
        System.out.println("Before destroy");
    }

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


//    @Autowired
//    public void customMethod(FortuneService fortuneService) {
//        System.out.println("In set method");
//        this.fortuneService = fortuneService;
//    }

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
