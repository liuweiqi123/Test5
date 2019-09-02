package com.example.demo.scheduled;

import com.example.demo.bean.Data;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class ScheduledDemo {
    @Scheduled(cron="0/2 * * * * ?")
    public void scheduledMethod(){
        System.out.println("定时器被触发"+new Date());
    }

}
