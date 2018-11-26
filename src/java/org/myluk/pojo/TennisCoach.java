package org.myluk.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component("sillyCoach")
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    @Autowired
    public void customMethod(FortuneService fortuneService) {
        System.out.println("In set method");
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
